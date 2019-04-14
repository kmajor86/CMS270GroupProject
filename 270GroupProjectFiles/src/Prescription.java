import java.util.ArrayList;

public class Prescription {
	
	//Data Members
		private String Id;
		private String dateIssued;
		private String doctor;
		private String patient;
		private ArrayList <DrugLine> drugLines;
		
		//Constructors
		public Prescription() {
			this.Id = "";
			this.dateIssued = "";
			this.doctor = "";
			this.patient = "";
			this.drugLines = new ArrayList <DrugLine>();
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
		public String getPatient() {
			return patient;
		}

		public void setPatient(String patient) {
			this.patient = patient;
		}
		public ArrayList<DrugLine> getDrugLines() {
			return drugLines;
		}
		public void setDrugLines(ArrayList<DrugLine> drugLines) {
			this.drugLines = drugLines;
		}
		public void addDrugLine(DrugLine dl) {
			drugLines.add(dl);
		}
		public void removeDrugLine(String drug) {
			for(int i = 0; i < drugLines.size(); i++) {
				if(drugLines.get(i).getDrug().equals(drug)) {
					drugLines.remove(i);
				}			
			}
			
		}

		//toString() Method
		public String toString() {
			
			String buildMe =  "Id: " + this.Id + "\nDate Issued: " + this.dateIssued + 
					"\nPrescribing Doctor: " + this.doctor + "\nPatient: " + this.patient;
			
			for(int i = 0; i < drugLines.size(); i++) {
				String addThisPiece = drugLines.get(i).toString();
				buildMe = buildMe + "\n" + addThisPiece;
			}
			
			return buildMe;
		}
		
	


}
