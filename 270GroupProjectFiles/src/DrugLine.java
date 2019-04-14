import java.util.ArrayList;

public class DrugLine {
	
	//Data members
	private String drug;
	private int dosage;
	private int refillsLeft;
	private int timesRefilled;
	
	//Constructors
	public DrugLine() {
		this.drug = "";
		this.dosage = 0;
		this.refillsLeft = 0;
		this.timesRefilled = 0;
	}
	
	public DrugLine(String dr, int d, int rl, int tr) {
		this.drug = dr;
		this.dosage = d;
		this.refillsLeft = rl;
		this.timesRefilled = tr;
	}

	//Getters and Setters
	public String getDrug() {
		return drug;
	}

	public void setDrug(String drug) {
		this.drug = drug;
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
	
	//toString()
	public String toString() {
		return "Drug: " + this.drug + "   Dosage: " + this.dosage + "   Refills Left: " + 
				this.refillsLeft + "   Refills Used: " + this.timesRefilled;
	}

}
