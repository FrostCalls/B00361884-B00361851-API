package Quote.winterwheat;

import Quote.Insurance;
import Quote.InsuranceFactory;

public class WinterWheatInsurance extends Insurance {

    InsuranceFactory insuranceFactory;
    public WinterWheatInsurance(InsuranceFactory insuranceFactory){

        this.insuranceFactory = insuranceFactory;

    }

    // Insurance building calls this method to build a winter wheat insurance     
	@Override
	public void makeInsurance() {
		// TODO Auto-generated method stub
		
		base = insuranceFactory.addInsuranceBase();
		rating = insuranceFactory.addInsuranceRating();
	}

}