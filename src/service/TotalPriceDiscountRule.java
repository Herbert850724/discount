package service;

import java.util.ArrayList;
import java.util.List;

import common.CartContext;
import common.Discount;
import common.Product;

public class TotalPriceDiscountRule extends RuleBase{

    private int minPrice;
    private int cheapPrice;

    
    public TotalPriceDiscountRule() {
    }


    public TotalPriceDiscountRule(int minPrice, int cheapPrice) {
        this.minPrice = minPrice;
        this.cheapPrice = cheapPrice;

        this.name = "折價券滿"+minPrice+"抵用"+cheapPrice+"元";
        this.note = "每筆交易僅能使用一次";
    }


    @Override
    public List<Discount> process(CartContext cart) {
        List<Discount> discounts = new ArrayList<Discount>();
        List<Product> matcheProducts = new ArrayList<Product>();
        
        for(Product p : cart.getPurchasedItems()){
            matcheProducts.add(p);
            
        }
        double totalProductPrice = cart.getTotalPrice();

        if(totalProductPrice > minPrice){
            Discount dis = new Discount();
            dis.setRuleName(name);
            dis.setAmount(cheapPrice);
            Product[] arr = {};
            dis.setProducts(arr);

            discounts.add(dis);
            
        }
        return discounts;
    }


    

}
