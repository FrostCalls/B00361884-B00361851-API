package Quote.berries;

import static org.junit.Assert.*;


import org.junit.Test;


public class BerriesInsuranceRatingTest {

	@Test
	public void testgetRatingMultiplier() {
		
		String expected = "35";
		
		String actual = new BerriesInsuranceRating().getRatingMultiplier();
		
		assertEquals(expected, actual);

	}


}
