package Quote.barley;

import static org.junit.Assert.*;



import org.junit.Test;


public class BarleyInsuranceFactoryTest {

	@Test
	public void testgetBaseCost() {
		
		String expected = "5000";
		
		String actual = new BarleyInsuranceFactory().addInsuranceBase().getBaseCost();
		
		assertEquals(expected, actual);

	}

	@Test
	public void testgetRatingMultiplier() {
		
		String expected = "25";
		
		String actual = new BarleyInsuranceFactory().addInsuranceRating().getRatingMultiplier();
		
		assertEquals(expected, actual);

	}


}