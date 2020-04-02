package Quote.barley;

import static org.junit.Assert.*;


import org.junit.Test;


public class BarleyInsuranceRatingTest {

	
	@Test
	public void testgetRatingMultiplier() {
		
		String expected = "25";
		
		String actual = new BarleyInsuranceRating().getRatingMultiplier();
		
		assertEquals(expected, actual);

	}


}
