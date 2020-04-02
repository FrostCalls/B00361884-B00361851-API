package Quote.winterwheat;

import Quote.InsuranceRating;

public class WinterWheatInsuranceRating implements InsuranceRating {

	@Override
	public String getRatingMultiplier(){
		return "30";
	}
}

