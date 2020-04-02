package Quote;

import Quote.barley.BarleyInsurance;
import Quote.barley.BarleyInsuranceFactory;
import Quote.berries.BerriesInsurance;
import Quote.berries.BerriesInsuranceFactory;
import Quote.winterwheat.WinterWheatInsurance;
import Quote.winterwheat.WinterWheatInsuranceFactory;
import User.iUser;

public  class uwsInsuranceBuilding extends AllInsuranceBuilder{
	Insurance theInsurance;
	


	protected  Insurance makeNewInsurance(String typeOfInsurance, iUser user, String descision) {
		Insurance theInsurance = null;
		if ( (user.getPermissionLvl() >= 1)) {
	
	    switch (typeOfInsurance) {
	  		case "Barley": {
				  InsuranceFactory InsuranceDetailsFactory = new BarleyInsuranceFactory();
				  theInsurance = new BarleyInsurance(InsuranceDetailsFactory);
				  theInsurance.setName("Barley Insurance");
				  theInsurance.setQteNum(1000000);
			 if ( (user.getPermissionLvl() == 2 || user.getPermissionLvl()==4 )) { {
				
			
				  switch (descision) {
				case "Accepted":{
					theInsurance.setStatus("Accepted");
					break;
				}
				case "Declined"	:{
					theInsurance.setStatus("Declined");
					break;
				}	
				case "Escalated"	:{
					theInsurance.setStatus("Escalated");
					break;
				}
					
				default: theInsurance.setStatus("Pending"); 
					break;
				}
			 }
				  
	  		} break;
	  		}
			case "Winter Wheat": {
				  InsuranceFactory InsuranceDetailsFactory = new WinterWheatInsuranceFactory();
				  theInsurance = new WinterWheatInsurance(InsuranceDetailsFactory);
				  theInsurance.setName("Winter Wheat Insurance");
				  theInsurance.setQteNum(3000000);
				  theInsurance.setStatus("quoted");
				  
				  if ( (user.getPermissionLvl() == 2 || user.getPermissionLvl()==4 )) { {
				  
				  switch (descision) {
				case "Accepted":{
					theInsurance.setStatus("Accepted");
					break;
				}
				case "Declined"	:{
					theInsurance.setStatus("Declined");
					break;
				}	
				case "Escalated"	:{
					theInsurance.setStatus("Escalated");
					break;
				}
					
				default: theInsurance.setStatus("Pending"); 
					break;
				}
				
			}
			}	 break;
			}
			case "Berries": {
				  InsuranceFactory InsuranceDetailsFactory = new BerriesInsuranceFactory();
				  theInsurance = new BerriesInsurance(InsuranceDetailsFactory);
				  theInsurance.setName("Berries Insurance");
				  theInsurance.setQteNum(2000000);
				  theInsurance.setStatus("quoted");
				  
				  if ( (user.getPermissionLvl() == 2 || user.getPermissionLvl()==4 )) {
				  
				  switch (descision) {
				case "Accepted":{
					theInsurance.setStatus("Accepted");
					break;
				}
				case "Declined"	:{
					theInsurance.setStatus("Declined");
					break;
				}	
				case "Escalated"	:{
					theInsurance.setStatus("Escalated");
					break;
				}
					
				default: theInsurance.setStatus("Pending"); 
					break;
				}
				 
				  }
				  }	 break;
	    }
	  return theInsurance;
	    
	} else {
		return null;
	}
	}
}
		






