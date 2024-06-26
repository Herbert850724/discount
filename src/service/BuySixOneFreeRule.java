package service;

import java.util.ArrayList;
import java.util.List;

import common.CartContext;
import common.Discount;
import common.Product;

public class BuySixOneFreeRule extends RuleBase{

    private int count;
    private int cheapPrice;
    
    public BuySixOneFreeRule() {
    }

    public BuySixOneFreeRule(int count, int cheapPrice) {
        this.count = count;
        this.cheapPrice = cheapPrice;

        this.name = ("購買"+count+"件折扣"+cheapPrice+"元");
    }

    @Override
    public List<Discount> process(CartContext cart) {
        List<Discount> discounts = new ArrayList<Discount>();
        List<Product> matchedProducts = new ArrayList<>();

        for(Product p : cart.getPurchasedItems()) {

            if(p.getTag() != null && p.getTag().equals("衛生紙")){
                matchedProducts.add(p);

                if(matchedProducts.size() == count){

                    Discount dis = new Discount();
                    dis.setRuleName(name);
                    dis.setAmount(cheapPrice);
                    dis.setProducts(matchedProducts.toArray(new Product[0]));

                    discounts.add(dis);

                    matchedProducts.clear();
                }

            }

        }

        return discounts;
    }

    
}
