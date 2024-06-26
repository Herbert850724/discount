package common;

import java.util.ArrayList;
import java.util.List;

public class CartContext {
    private List<Product> purchasedItems = new ArrayList<Product>();
    private List<Discount> appliedDiscounts = new ArrayList<Discount>();
    private double totalPrice;
    public CartContext() {
    }
    public CartContext(List<Product> purchasedItems, List<Discount> appliedDiscounts, double totalPrice) {
        this.purchasedItems = purchasedItems;
        this.appliedDiscounts = appliedDiscounts;
        this.totalPrice = totalPrice;
    }
    public List<Product> getPurchasedItems() {
        return purchasedItems;
    }
    public void setPurchasedItems(List<Product> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }
    public List<Discount> getAppliedDiscounts() {
        return appliedDiscounts;
    }
    public void setAppliedDiscounts(List<Discount> appliedDiscounts) {
        this.appliedDiscounts = appliedDiscounts;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    @Override
    public String toString() {
        return "CartContext [purchasedItems=" + purchasedItems + ", appliedDiscounts=" + appliedDiscounts
                + ", totalPrice=" + totalPrice + "]";
    }

    
}
