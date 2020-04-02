package Quote.berries;

import static org.junit.Assert.*;


import org.junit.Test;


public class BerriesInsuranceBaseTest {

	@Test
	public void testgetBaseCost() {
		
		String expected = "15000";
		
		String actual = new BerriesInsuranceBase().getBaseCost();
		
		assertEquals(expected, actual);

	}


}
