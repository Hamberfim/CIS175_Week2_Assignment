package week2_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ShoeStock;
import model.Shoes;

public class TestShoeAndSizeStock {
	ShoeStock sStockAndSize = new ShoeStock();
	Shoes shoes = new Shoes("sketchers", 10.0);
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsInStockAndHaveSize() {
		shoes.setBrand("skechers");
		shoes.setSize(10.0);
		assertEquals(true, sStockAndSize.isInStockAndHaveSize(shoes, shoes));
	}
	
	@Test
	public void testIsInStockButDoNotHaveSize() {
		shoes.setBrand("skechers");
		shoes.setSize(6);
		assertEquals(false, sStockAndSize.isInStockAndHaveSize(shoes, shoes));
	}
	
	@Test
	public void testNotInStock() {
		shoes.setBrand("nike");
		shoes.setSize(6);
		assertEquals(false, sStockAndSize.isInStockAndHaveSize(shoes, shoes));
	}

}
