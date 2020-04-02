package Quote.barley;

import Quote.InsuranceRating;

public class BarleyInsuranceRating implements InsuranceRating {

	@Override
	public String getRatingMultiplier(){
		return "25";
	}
}
