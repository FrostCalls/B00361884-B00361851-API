package Quote.berries;

import Quote.InsuranceRating;

public class BerriesInsuranceRating implements InsuranceRating {

	@Override
	public String getRatingMultiplier(){
		return "35";
	}
}