
public class OutPatient extends Patient{
	
	private String OutPatient;
	
	private String getDateLastVisit;
	
	private String updateDateLastVisit;

	public String getOutPatient() {
		return OutPatient;
	}

	public void setOutPatient(String outPatient) {
		OutPatient = outPatient;
	}

	public String getGetDateLastVisit() {
		return getDateLastVisit;
	}

	public void setGetDateLastVisit(String getDateLastVisit) {
		this.getDateLastVisit = getDateLastVisit;
	}

	public String getUpdateDateLastVisit() {
		return updateDateLastVisit;
	}

	public void setUpdateDateLastVisit(String updateDateLastVisit) {
		this.updateDateLastVisit = updateDateLastVisit;
	}

}
