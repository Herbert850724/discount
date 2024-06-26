package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import common.CartContext;
import common.Discount;
import common.Product;

public class MatchDiscountRule extends RuleBase{

    private List<DiscountRule> discountTable;
    

    public MatchDiscountRule(List<DiscountRule> discountTable) {
        this.discountTable = discountTable;
        this.name = "超值加購";


    }    

    @Override
    public List<Discount> process(CartContext cart) {
        List<Discount> discounts = new ArrayList<>();

        //method1
        //List<Product> purchasedItems = new ArrayList<>(cart.getPurchasedItems());

        List<Product> purchasedItems = new ArrayList<>();

        //method2
        //purchasedItems.addAll(cart.getPurchasedItems());
        

        //method3
        for(Product p : cart.getPurchasedItems()){
            purchasedItems.add(p);
        }
        for (DiscountRule d : discountTable) {
            List<Product> drinks = purchasedItems.stream()
                    .filter(p -> p.getTag().contains(d.getDrink()))
                    .sorted(Comparator.comparing(Product::getPrice).reversed())
                    .collect(Collectors.toList());

            List<Product> foods = purchasedItems.stream()
                    .filter(p -> p.getTag().contains(d.getFood()))
                    .sorted(Comparator.comparing(Product::getPrice).reversed())
                    .collect(Collectors.toList());

            if (drinks.isEmpty() || foods.isEmpty()) {
                continue;
            }

            for (int i = 0; ; i++) {
                if (drinks.size() <= i || foods.size() <= i) {
                    break;
                }

                if (!purchasedItems.contains(drinks.get(i)) || !purchasedItems.contains(foods.get(i))) {
                    break;
                }

                purchasedItems.remove(drinks.get(i));
                purchasedItems.remove(foods.get(i));

                Discount dis = new Discount();

                dis.setRuleName(name+d.getPrice());
                dis.setAmount(drinks.get(i).getPrice() + foods.get(i).getPrice() - d.getPrice());

                Product[] arr = {drinks.get(i),foods.get(i)};
                dis.setProducts(arr);
                

                discounts.add(dis);
            }
        }

        return discounts;
    }
    public static class DiscountRule {
        private String drink;
        private String food;
        private double price;

        // Constructor, getters and setters
        public DiscountRule(String drink, String food, double price) {
            this.drink = drink;
            this.food = food;
            this.price = price;
        }

        public String getDrink() {
            return drink;
        }

        public String getFood() {
            return food;
        }

        public double getPrice() {
            return price;
        }
    }
}
