package Quote;

public abstract class Insurance{

public String status;
private String name;
private int QteNum;
public InsuranceBase base;
protected InsuranceRating rating;


public String getStatus() { 
	return status; }

public void setStatus(String newStatus) { 
	status = newStatus; }

    public String getName() { 
    	return name; }

    public void setName(String newName) { 
    	name = newName; }

	public int getQteNum() {
		return QteNum;
	}

	public void setQteNum(int qteNum) {
		QteNum = qteNum;
	}

	public abstract void makeInsurance();
	
	}



	

