package Quote.barley;

import static org.junit.Assert.*;

import org.junit.Test;

public class BarleyInsuranceBaseTest {

	
	@Test
	public void testgetBaseCost() {
		
		String expected = "5000";
		
		String actual = new BarleyInsuranceBase().getBaseCost();
		
		assertEquals(expected, actual);

	}


}
