import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* <Liam Martinez>
   <CMS 270>
   <Final Project>
   <3/24/2019>
   <"On my honor, I have not given nor received nor witnessed any unauthorized assistance on this work.">
*/
public class Pharmacist {
	
	//data members
	private String name, ssn, certificationdate;
	private ArrayList<String> prescription;
	
	//No args constructor
	public Pharmacist()
	{
		
	}
	
	//Regular constructor
	public Pharmacist(String n, String s, String c)
	{
		name = n;
		ssn = s;
		certificationdate = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getCertificationdate() {
		return certificationdate;
	}

	public void setCertificationdate(String certificationdate) {
		this.certificationdate = certificationdate;
	}
	
	public void commit()
	{
		try {
			File outFile = new File("PharmacistData");
			PrintWriter ps = new PrintWriter(outFile);
			ps.println("Pharmacist's name is " + getName());
			ps.println("Pharmacist's ssn is " + getSsn());
			ps.println("Parmacist's certification date is " + getCertificationdate());
			ps.println("Prescription of " + prescription + " filled");
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fillPrescription(boolean cred, Prescription fill)
	{
		if(fill == true)
		{
			File f = new File("PharmacistData");
			Scanner input = new Scanner(f);
			while(input.hasNextLine())
			{
				String prescription = input.nextLine();
				ArrayList<String> drug = new ArrayList<String>(fill.getDrug);
				for(int i = 0; i < drug.size(); i++)
				{
					if(prescription == drug.get(i))
					{
						System.exit(1);
					}
				}
			}
			input.close();
			List<String> bad = new List<String>(findDrugContraindications(fill.getDrug()));
			ArrayList<String> counter = new ArrayList<String>(fill.getDrugsPerscribed());
			for(int i = 0; i < bad.size(); i++)
			{
				String bad2 = bad.get(i);
				for(int i2 = 0; i2 < counter.size(); i2++)
				{
					String counter2 = counter.get(i2);
					if(bad2 == counter2)
					{
						System.out.println("Unable to fill prescription.  Drug contraindication of " + findDrugContraindications(fill.getDrug()) + " found.");
						System.exit(1);
					}
				}
			}
			prescription = fill.getDrug();
			System.out.println("Prescription fill succesful.");
		}
	}
	
	public List<String> findDrugContraindications(Drug d)
	{
		List<String> contraindications = d.getContraindications();
		return contraindications;
	}
}
