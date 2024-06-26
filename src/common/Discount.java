package common;

import java.util.Arrays;

public class Discount {
    private int id;
    private String ruleName;
    private Product[] products;
    private double amount;
    public Discount() {
    }
    public Discount(int id, String ruleName, Product[] products, double amount) {
        this.id = id;
        this.ruleName = ruleName;
        this.products = products;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRuleName() {
        return ruleName;
    }
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Discount [id=" + id + ", ruleName=" + ruleName + ", products=" + Arrays.toString(products) + ", amount="
                + amount + "]";
    }
   
    

}
