package week2_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ShoeStock;
import model.Shoes;

public class TestShoeSize {
	ShoeStock sSize = new ShoeStock();
	Shoes shoesSize = new Shoes("llbean");

	@Before
	public void setUp() throws Exception {
	}

	@Test // assertion test type 3
	public void testIsSizeAvail() {
		shoesSize.setSize(11.5);
		String messTest = "Size Is Avalable";
		String messRecieved = sSize.isInStockSize(shoesSize);
		assertTrue(messTest.equals(messRecieved));

	}
	
	@Test  // assertion test type 3
	public void testIsSizeNotAvail() {
		shoesSize.setSize(7.5);
		String messTest = "Size is NOT Avalable";
		String messRecieved = sSize.isInStockSize(shoesSize);
		assertTrue(messTest.equals(messRecieved));
	}

}
