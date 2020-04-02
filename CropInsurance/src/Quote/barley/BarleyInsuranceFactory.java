package Quote.barley;

import Quote.InsuranceBase;


import Quote.InsuranceFactory;
import Quote.InsuranceRating;

public class BarleyInsuranceFactory implements InsuranceFactory {

	@Override
	public InsuranceBase addInsuranceBase() {
		return new BarleyInsuranceBase();

	}
	@Override
	public InsuranceRating  addInsuranceRating() {
		return new BarleyInsuranceRating();
	}	

}

