package model;

public class ShoeStock {
	//Anthony Hamlin
	
	public boolean isInStock (Shoes brand) {
		if ((brand.getBrand().equals("skechers")) || (brand.getBrand().equals("crocs")) || (brand.getBrand().equals("llbean"))) {
			System.out.println("Brand Is Avalable");
			return true;
		} else {
			System.out.println("Brand Is NOT Avalable");
			return false;
		}
	}
	
	public String isInStockSize (Shoes size) {
		if ((size.getSize() >= 8) && (size.getSize() <= 12)) {
			String message = "Size Is Avalable";
			System.out.println(message);
			return message;
		} else {
			String message = "Size is NOT Avalable";
			System.out.println(message);
			return message;
		}
		
	}

}
