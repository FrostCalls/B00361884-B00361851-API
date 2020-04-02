package Quote.winterwheat;

import Quote.InsuranceBase;
import Quote.InsuranceFactory;
import Quote.InsuranceRating;

public class WinterWheatInsuranceFactory implements InsuranceFactory {

	@Override
	public InsuranceBase addInsuranceBase() {
		return new WinterWheatInsuranceBase();

	}
	@Override
	public InsuranceRating  addInsuranceRating() {
		return new WinterWheatInsuranceRating();
	}

}
