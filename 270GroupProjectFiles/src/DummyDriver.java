import java.util.ArrayList;

public class DummyDriver {

	public static void main(String[] args) {
		
		DrugLine dl = new DrugLine("Driggy Drug", 200, 16, 8);
		DrugLine dl2 = new DrugLine("Sweetness", 500, 16, 12);
		ArrayList <DrugLine> lines = new ArrayList <DrugLine>();
		
		Prescription p = new Prescription();
		p.setId("87TYN64O");
		p.setDateIssued("04/13/2019");
		p.setDoctor("Dr. Crazy Parent");
		p.setPatient("Adorable Child");
		p.setDrugLines(lines);
		
		
		p.addDrugLine(dl);
		p.addDrugLine(dl2);
		p.removeDrugLine("Sweetness");
		
		System.out.println(p.toString());
		

	}

}
