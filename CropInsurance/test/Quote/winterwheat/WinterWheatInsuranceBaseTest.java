package Quote.winterwheat;

import static org.junit.Assert.*;


import org.junit.Test;


public class WinterWheatInsuranceBaseTest {

	@Test
	public void testgetBaseCost() {
	
		String expected = "10000";
		
		String actual = new WinterWheatInsuranceBase().getBaseCost();
		
		assertEquals(expected, actual);

	}


}