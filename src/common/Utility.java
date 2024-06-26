package common;

import java.util.ArrayList;
import java.util.List;

import service.BuyMoreBoxesDiscountRule;
import service.BuySixOneFreeRule;
import service.BuyTwoOneForHalfRule;
import service.MatchDiscountRule;
import service.MatchDiscountRule.DiscountRule;
import service.RuleBase;
import service.TenForSecondRule;
import service.TotalPriceDiscountRule;

public class Utility {

    public static void loadProducts(List<Product> list){
        for(Product p : list){
            System.out.println(p.getName()+"\t"+p.getPrice()+"元");
        }    
    }

    public static double checkoutProcess(List<Product> list){
        double sum = 0;
        for(Product p : list){
            sum += p.getPrice();
        }

        return sum;
    } 

    public static List<RuleBase> loadRules() {
        List<RuleBase> rules = new ArrayList<>();
        rules.add(new BuyMoreBoxesDiscountRule(2, 12));
        rules.add(new BuyTwoOneForHalfRule(2, 5));
        rules.add(new BuySixOneFreeRule(6,100));
        rules.add(new TenForSecondRule(10));
        
        DiscountRule dis1 = new DiscountRule("自由配飲料#39","自由配食物#39",39);
        DiscountRule dis2 = new DiscountRule("自由配飲料#49","自由配食物#49",49);
        DiscountRule dis3 = new DiscountRule("自由配飲料#49","自由配食物#59",49);
        DiscountRule dis4 = new DiscountRule("自由配飲料#59","自由配食物#59",59);
        DiscountRule dis5 = new DiscountRule("自由配飲料#59","自由配食物#49",59);


        List<DiscountRule> list = new ArrayList<>();
        list.add(dis1);
        list.add(dis2);
        list.add(dis3);
        list.add(dis4);
        list.add(dis5);
        rules.add(new MatchDiscountRule(list));
        rules.add(new TotalPriceDiscountRule(1000, 100));
        return rules;
    }
}
