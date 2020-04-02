package Quote.berries;

import static org.junit.Assert.*;

import org.junit.Test;


public class BerriesInsuranceFactoryTest {

	@Test
	public void testgetBaseCost() {
		
		String expected = "15000";
		
		String actual = new BerriesInsuranceFactory().addInsuranceBase().getBaseCost();
		
		assertEquals(expected, actual);

	}

	@Test
	public void testgetRatingMultiplier() {
		
		String expected = "35";
		
		String actual = new BerriesInsuranceFactory().addInsuranceRating().getRatingMultiplier();
		
		assertEquals(expected, actual);

	}


}
