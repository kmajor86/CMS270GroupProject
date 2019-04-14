import java.util.ArrayList;

public class Prescription {
	
	//Data Members
		private String Id;
		private String dateIssued;
		private String doctor;
		private ArrayList <DrugLine> drugLines;
		
		//Constructors
		public Prescription() {
			this.Id = "";
			this.dateIssued = "";
			this.doctor = "";
			this.drugLines = new ArrayList <DrugLine>;
		}
		
		//Getters and Setters
		public String getId() {
			return Id;
		}
		public void setId(String id) {
			Id = id;
		}
		public String getDateIssued() {
			return dateIssued;
		}
		public void setDateIssued(String dateIssued) {
			this.dateIssued = dateIssued;
		}
		public String getDoctor() {
			return doctor;
		}
		public void setDoctor(String doctor) {
			this.doctor = doctor;
		}
		public ArrayList<DrugLine> getDrugLines() {
			return drugLines;
		}
		public void setDrugLines(ArrayList<DrugLine> drugLines) {
			this.drugLines = drugLines;
		}
		
	


}
