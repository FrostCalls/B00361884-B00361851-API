package Quote.winterwheat;

import static org.junit.Assert.*;


import org.junit.Test;


public class WinterWheatInsuranceRatingTest {

	@Test
	public void testgetRatingMultiplier() {
		
		String expected = "30";
		
		String actual = new WinterWheatInsuranceRating().getRatingMultiplier();
		
		assertEquals(expected, actual);

	}


}