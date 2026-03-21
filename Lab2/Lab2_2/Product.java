package Lab2_2;

public class Product {
	private String id;
	private String name;
	private double price;
	private ProductCategory category;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(id == null || id.trim().isEmpty()) {
			throw new IllegalArgumentException("ID khong hop le");
		}else
		this.id = id;
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
		if (price < 0) {
		    throw new IllegalArgumentException("Gia khong hop le!");
		}else
		this.price = price;
	}
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		if (category== null) {
			throw new IllegalArgumentException("Khong duoc null");
		}else
		this.category = category;
	}
	public Product(String id, String name, double price, ProductCategory category) {
		setCategory(category);
		setId(id);
		setName(name);
		setPrice(price);
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	public Product() {
		
	}
	
	
	
	
	
}
