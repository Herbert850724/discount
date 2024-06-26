package common;

import java.util.ArrayList;
import java.util.List;

import service.RuleBase;

public class Pos {

    private List<RuleBase> activedRules = new ArrayList<>();

    public List<RuleBase> getActivedRules() {
        return activedRules;
    }

    public void setActivedRules(List<RuleBase> activedRules) {
        this.activedRules = activedRules;
    }

    public void checkoutProcess(CartContext cart) {
        
        cart.getAppliedDiscounts().clear();
        cart.setTotalPrice(cart.getPurchasedItems().stream().mapToDouble(Product::getPrice).sum());

        for (RuleBase rule : activedRules) {
            List<Discount> discounts = rule.process(cart);
            cart.getAppliedDiscounts().addAll(discounts);
            cart.setTotalPrice(cart.getTotalPrice() - discounts.stream().mapToDouble(Discount::getAmount).sum());
        }
        
    }
}
