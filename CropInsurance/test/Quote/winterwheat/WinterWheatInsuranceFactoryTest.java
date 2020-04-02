package Quote.winterwheat;

import static org.junit.Assert.*;

import org.junit.Test;


public class WinterWheatInsuranceFactoryTest {

	@Test
	public void testgetBaseCost() {
		
		String expected = "10000";
		
		String actual = new WinterWheatInsuranceFactory().addInsuranceBase().getBaseCost();
		
		assertEquals(expected, actual);

	}

	@Test
	public void testgetRatingMultiplier() {
		
		String expected = "30";
		
		String actual = new WinterWheatInsuranceFactory().addInsuranceRating().getRatingMultiplier();
		
		assertEquals(expected, actual);

	}


}