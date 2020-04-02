package Quote.berries;

import Quote.InsuranceBase;
import Quote.InsuranceFactory;
import Quote.InsuranceRating;

public class BerriesInsuranceFactory implements InsuranceFactory {

	@Override
	public InsuranceBase addInsuranceBase() {
		return new BerriesInsuranceBase();
		
	}
	@Override
	public InsuranceRating  addInsuranceRating() {
		return new BerriesInsuranceRating();
	}
	
}