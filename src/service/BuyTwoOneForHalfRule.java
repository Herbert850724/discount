package service;

import java.util.ArrayList;
import java.util.List;

import common.CartContext;
import common.Discount;
import common.Product;

public class BuyTwoOneForHalfRule extends RuleBase{

    private int count;
    private double percent;

    public BuyTwoOneForHalfRule() {
    }
    public BuyTwoOneForHalfRule(int count, double percent) {
        this.count = count;
        this.percent = percent;

        this.name = "雞湯塊第"+count+"件"+percent+"折";
        this.note = "雞湯塊限定";
    }
    @Override
    public List<Discount> process(CartContext cart) {
        List<Discount> discounts = new ArrayList<>();
        List<Product> matchedProducts = new ArrayList<>();
        
        for(Product p : cart.getPurchasedItems()){

            if(p.getTag() != null && p.getTag().equals("雞湯塊")){
                matchedProducts.add(p);

                if(matchedProducts.size() == count){

                    double totalProductPrice = matchedProducts.stream().mapToDouble(Product::getPrice).sum();
                    double discountAmount = totalProductPrice*0.5*(10-percent)*0.1;

                    Discount dis = new Discount();
                    dis.setAmount(discountAmount);
                    dis.setRuleName(name);
                    dis.setProducts(matchedProducts.toArray(new Product[0]));
                    discounts.add(dis);

                    matchedProducts.clear();
                }
            }
        }

        return discounts;
    }    

}
