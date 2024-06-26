package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import common.CartContext;
import common.Discount;
import common.Product;

public class BuyMoreBoxesDiscountRule extends RuleBase{

    private int boxCount;
    private int percentOff;

    public BuyMoreBoxesDiscountRule() {
    }

    public BuyMoreBoxesDiscountRule(int boxCount, int percentOff) {
        this.boxCount = boxCount;
        this.percentOff = percentOff;
        this.name = "任"+boxCount+"箱結帳"+(100-percentOff)+"折！";
        this.note = "熱銷飲品 限時優惠";
    }

     @Override
    public List<Discount> process(CartContext cart) {
        List<Discount> discounts = new ArrayList<>();
        List<Product> matchedProducts = new ArrayList<>();

        for(Product p : cart.getPurchasedItems()) {
            if(p.getTag() != null && p.getTag().equals("熱銷飲品")){
                matchedProducts.add(p);
            }
        }
        List<Product> newOne = matchedProducts.stream().sorted(Comparator.comparing(Product::getPrice))
                                    .limit(matchedProducts.size() - (matchedProducts.size() % boxCount)).toList();

        List<Product> matched = new ArrayList<>();
        for(Product p : newOne) {

            matched.add(p);

            if(matched.size() == boxCount){

                double totalProductPrice = matched.stream().mapToDouble(Product::getPrice).sum();
                double discountAmount = totalProductPrice * percentOff * 0.01;

                Discount dis = new Discount();
            
                dis.setRuleName(name);
                dis.setAmount(discountAmount);
                dis.setProducts(matched.toArray(new Product[0]));
        
                discounts.add(dis);

                matched.clear();

            }
        }
        return discounts;
        
    }

}
