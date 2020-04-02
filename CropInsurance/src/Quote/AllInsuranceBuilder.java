package Quote;

import User.iUser;

public abstract class AllInsuranceBuilder {
	
	protected abstract Insurance makeNewInsurance(String typeOfInsurance, iUser user, String descision);
	
	public Insurance orderTheInsurance(String typeOfInsurance,iUser user, String descision) {
		Insurance theInsurance = makeNewInsurance(typeOfInsurance, user, descision);
		theInsurance.makeInsurance();
		return theInsurance;
	}

}
