import java.util.ArrayList;

public class Patient {
	
	private String SSN;

	private String Name;

	private String Address;

	private String PhoneNumber;

	private String InsuranceProvider;

	private ArrayList<Drug> DrugsPrescribed;
	
	public Patient() {

	}

	public Patient(String ssn, String n, String a, String pn, String ip) {
		SSN = ssn;
		Name = n;
		Address = a;
		PhoneNumber = pn;
		InsuranceProvider =ip;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
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

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getInsuranceProvider() {
		return InsuranceProvider;
	}

	public void setInsuranceProvider(String insuranceProvider) {
		InsuranceProvider = insuranceProvider;
	}

	public ArrayList<Drug> getDrugsPrescribed() {
		return DrugsPrescribed;
	}

	public void setDrugsPrescribed(ArrayList<Drug> drugsPrescribed) {
		DrugsPrescribed = drugsPrescribed;
	}

	public String toString() {
		return SSN+" "+Name+" "+Address+" "+PhoneNumber+" "+InsuranceProvider;
	}

	public ArrayList<String> FindDoctors(Drug d) {
		return ;
	}

	public String ContactDoctor(Doctor doc) {
		return ;
	}

	public void Commit(File f, String c) {
	}

}
