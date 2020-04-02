package Quote.berries;

import Quote.Insurance;
import Quote.InsuranceFactory;

public  class BerriesInsurance extends Insurance {

    InsuranceFactory insuranceFactory;
    public BerriesInsurance(InsuranceFactory insuranceFactory){

        this.insuranceFactory = insuranceFactory;

    }

    // Insurance building calls this method to build a berries insurance
	@Override
	public void makeInsurance() {
		// TODO Auto-generated method stub
		
		base = insuranceFactory.addInsuranceBase();
		rating = insuranceFactory.addInsuranceRating();
	}

}

