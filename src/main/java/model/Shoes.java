package model;

public class Shoes {
	//Anthony Hamlin
	private String brand;
	private double size;
	private double price;
	
	
	//Constructors
	public Shoes() {
		super();
	}
	
	public Shoes(String brand) {
		super();
		this.brand = brand;
	}
	
	public Shoes(String brand, double size) {
		super();
		this.brand = brand;
		this.size = size;
	}

	//setters/getters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shoes [brand=" + brand + ", size=" + size + ", price=" + price + ", getBrand()=" + getBrand()
				+ ", getSize()=" + getSize() + ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + "]";
	}

	

}
