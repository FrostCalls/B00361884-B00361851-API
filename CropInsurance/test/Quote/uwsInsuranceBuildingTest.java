package Quote;

import static org.junit.Assert.*;


import org.junit.Test;

import User.Broker;
import User.Supervisor;
import User.iUser;

public class uwsInsuranceBuildingTest {
	
	String typeOfInsurancebar = "Barley";

	String typeOfInsuranceber = "Berries";

	String typeOfInsuranceww = "Winter Wheat";
	
	String typedefault = "default";
	
	String descisionA = "Accepted";
	
	String descisionD = "Declined";
	
	String descisionE = "Escalated";
	
	String descisionDEF = "Pending";
	
			@Test
			public void testMakeInsurancebarley() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Broker();
				String actual = testinsurance.makeNewInsurance(typeOfInsurancebar, user, descisionA).getName();
				String expected = "Barley Insurance";
				assertEquals(expected, actual);
			}
			
			@Test
			public void testMakeInsurancebarleyAcc() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsurancebar, user, descisionA).getStatus();
				String expected = "Accepted";
				assertEquals(expected, actual);
			}
			
			@Test
			public void testMakeInsurancebarleyDec() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsurancebar, user, descisionD).getStatus();
				String expected = "Declined";
				assertEquals(expected, actual);
			}
			
			@Test
			public void testMakeInsurancebarleyEsc() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsurancebar, user, descisionE).getStatus();
				String expected = "Escalated";
				assertEquals(expected, actual);
			}
			
			@Test
			public void testMakeInsurancebarleyDef() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsurancebar, user, descisionDEF).getStatus();
				String expected = "Pending";
				assertEquals(expected, actual);
			}		
			
			@Test
			public void testMakeInsuranceberriesAcc() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsuranceber, user, descisionA).getStatus();
				String expected = "Accepted";
				assertEquals(expected, actual);
			}
			
			@Test
			public void testMakeInsuranceberriesDec() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsuranceber, user, descisionD).getStatus();
				String expected = "Declined";
				assertEquals(expected, actual);
			}
			
			@Test
			public void testMakeInsuranceberriesEsc() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsuranceber, user, descisionE).getStatus();
				String expected = "Escalated";
				assertEquals(expected, actual);
			}
			
			@Test
			public void testMakeInsuranceberriesDef() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsuranceber, user, descisionDEF).getStatus();
				String expected = "Pending";
				assertEquals(expected, actual);
			}
			
			
			@Test
			public void testMakeInsurancewwAcc() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsuranceww, user, descisionA).getStatus();
				String expected = "Accepted";
				assertEquals(expected, actual);
			}
			
			@Test
			public void testMakeInsurancewwDec() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsuranceww, user, descisionD).getStatus();
				String expected = "Declined";
				assertEquals(expected, actual);
			}
			
			@Test
			public void testMakeInsurancewwEsc() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsuranceww, user, descisionE).getStatus();
				String expected = "Escalated";
				assertEquals(expected, actual);
			}
			
			@Test
			public void testMakeInsurancewwDef() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Supervisor();
				String actual = testinsurance.makeNewInsurance(typeOfInsuranceww, user, descisionDEF).getStatus();
				String expected = "Pending";
				assertEquals(expected, actual);
			}
		
			@Test
			public void testdefault() {
				uwsInsuranceBuilding testinsurance = new uwsInsuranceBuilding();
				iUser user = new Broker();
				Insurance actual = testinsurance.makeNewInsurance(typedefault, user, descisionDEF);
				String expected = null;
				assertEquals(expected, actual);
			}
}

