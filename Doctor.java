import java.util.ArrayList;

public class Doctor {

	private String Name;

	private String Address;

	private String Phonenumber;

	private String Specialization;

	private ArrayList<String> Watchlist;
	
	public Doctor() {

	}

	public Doctor(String n, String a, String pn, String s) {
		Name = n;
		Address = a;
		Phonenumber = pn;
		Specialization =s;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public ArrayList<String> getWatchlist() {
		return Watchlist;
	}

	public void setWatchlist(ArrayList<String> watchlist) {
		Watchlist = watchlist;
	}

	public String toString() {
		return Name+" "+Address+" "+Phonenumber+" "+Specialization;
	}

	public void fillPrescription(boolean b) {

	}

	public ArrayList<String> findDrugContraindictions(Drug d) {
		return ;
	}

	public void Commit() {
	}

}
