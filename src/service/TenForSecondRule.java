package service;

import java.util.ArrayList;
import java.util.List;

import common.CartContext;
import common.Discount;
import common.Product;

public class TenForSecondRule extends RuleBase{
    private int addPrice;

    public TenForSecondRule() {
    }
    public TenForSecondRule(int addPrice) {
        this.addPrice = addPrice;
        this.name = "加"+addPrice+"元多一件";  
    }
    
    @Override
    public List<Discount> process(CartContext context) {
        List<Discount> discounts = new ArrayList<>();
        List<Product> matchedProducts = new ArrayList<>();

        for(Product p : context.getPurchasedItems()) {

            if(p.getTag()!=null && p.getTag().equals("加購優惠")){
                matchedProducts.add(p);

                if(matchedProducts.size() == 2){
                    double totalAmount = p.getPrice()-addPrice;

                    Discount dis = new Discount();
                    dis.setRuleName(name);
                    dis.setAmount(totalAmount);
                    dis.setProducts(matchedProducts.toArray(new Product[0]));

                    discounts.add(dis);

                    matchedProducts.clear();
                }
            }
        }
        return discounts;

    }

    
}
