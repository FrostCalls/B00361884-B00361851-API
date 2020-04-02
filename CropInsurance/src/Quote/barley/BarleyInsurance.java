package Quote.barley;

import Quote.Insurance; 
import Quote.InsuranceFactory;

public class BarleyInsurance extends Insurance {

    InsuranceFactory insuranceFactory;
    
    public BarleyInsurance(InsuranceFactory insuranceFactory){
        this.insuranceFactory = insuranceFactory;
        
    }

	@Override
	public void makeInsurance() {
		// TODO Auto-generated method stub
		
		base = insuranceFactory.addInsuranceBase();
		rating = insuranceFactory.addInsuranceRating();
	}

}

