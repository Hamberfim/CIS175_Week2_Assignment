package week2_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ShoeStock;
import model.Shoes;

public class TestShoeStock {
	ShoeStock sStock = new ShoeStock();
	Shoes shoes = new Shoes("sketchers");

	@Before
	public void setUp() throws Exception {
	}

	@Test  // assertion test type 1
	public void testIsInStockTrue() {
		shoes.setBrand("skechers");
		assertEquals(true, sStock.isInStock(shoes));
	}
	
	@Test  // assertion test type 2
	public void testIsInStockFalse() {
		shoes.setBrand("vans");
		assertFalse(sStock.isInStock(shoes));
	}
	

}
