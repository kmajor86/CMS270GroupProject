import java.util.ArrayList;

public class DrugLine {
	
	//Data members
	private ArrayList <String> drugs;
	private int dosage;
	private int refillsLeft;
	private int timesRefilled;
	
	//Constructors
	public DrugLine() {
		this.drugs = new ArrayList <String>();
		this.dosage = 0;
		this.refillsLeft = 0;
		this.timesRefilled = 0;
	}
	
	public DrugLine(ArrayList <String> dr, int d, int rl, int tr) {
		this.drugs = dr;
		this.dosage = d;
		this.refillsLeft = rl;
		this.timesRefilled = tr;
	}

	//Getters and Setters
	public ArrayList<String> getDrugs() {
		return drugs;
	}

	public void setDrugs(ArrayList<String> drugs) {
		this.drugs = drugs;
	}

	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	public int getRefillsLeft() {
		return refillsLeft;
	}

	public void setRefillsLeft(int refillsLeft) {
		this.refillsLeft = refillsLeft;
	}

	public int getTimesRefilled() {
		return timesRefilled;
	}

	public void setTimesRefilled(int timesRefilled) {
		this.timesRefilled = timesRefilled;
	}
	
	

}
