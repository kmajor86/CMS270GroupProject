/* <Liam Martinez>
   <CMS 270>
   <Final Project>
   <4/2/2019>
   <"On my honor, I have not given nor received nor witnessed any unauthorized assistance on this work.">
*/
public class InPatient extends Patient {
	
	//data members
	private String dateAdmitted, bed;
	
	//No args constructor
	public InPatient()
	{
		
	}
	
	//Regular constructor
	public InPatient(String d, String b)
	{
		dateAdmitted = d;
		bed = b;
	}

	public String getDateAdmitted() {
		return dateAdmitted;
	}

	public void setDateAdmitted(String dateAdmitted) {
		this.dateAdmitted = dateAdmitted;
	}

	public String getBed() {
		return bed;
	}

	public void setBed(String bed) {
		this.bed = bed;
	}
	
	public String toString()
	{
		return getName() + " was admitted on " + dateAdmitted + " to bed " + bed;
	}

}
