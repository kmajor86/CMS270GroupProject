import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/* <Liam Martinez>
   <CMS 270>
   <Final Project>
   <4/8/2019>
   <"On my honor, I have not given nor received nor witnessed any unauthorized assistance on this work.">
*/

public class Nurse {
	
	//data members
	private String name;
	
	//No args constructor
	public Nurse()
	{
		
	}
	
	//Regular constructor
	public Nurse(String n)
	{
		name = n;
	}

	//Retrieves the value assigned to name.
	public String getName() {
		return name;
	}

	//Assigns a new value to name.
	public void setName(String name) {
		this.name = name;
	}
	
	//Adds the name value to the designated text file.
	public void commit()
	{
		try {
			File outFile = new File("NurseData");
			PrintWriter ps = new PrintWriter(outFile);
			ps.println("Nurse's name is " + getName());
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
