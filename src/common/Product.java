package common;

public class Product {

	private int id;
	private String sku;
	private String name;
	private double price;
	private String tag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", sku=" + sku + ", name=" + name + ", price=" + price + ", tag=" + tag + "]";
	}
	public Product(int id, String sku, String name, double price, String tag) {
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.price = price;
		this.tag = tag;
	}
	public Product() {
	}
	
	
}
