import java.util.ArrayList;

public class Drug {
	
	//Data Members
	private String name;
	private String chemicalName;
	private String ingredients;
	private String manufacturingCompany;
	private String type;
	private ArrayList <String> conditions;
	private ArrayList <String> contraindications;
	
	//Constructors
	public Drug() {
		this.name = "";
		this.chemicalName = "";
		this.ingredients = "";
		this.manufacturingCompany = "";
		this.type = "";
		this.conditions = new ArrayList <String>();
		this.contraindications = new ArrayList <String>();
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChemicalName() {
		return chemicalName;
	}
	public void setChemicalName(String chemicalName) {
		this.chemicalName = chemicalName;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getManufacturingCompany() {
		return manufacturingCompany;
	}
	public void setManufacturingCompany(String manufacturingCompany) {
		this.manufacturingCompany = manufacturingCompany;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<String> getConditions() {
		return conditions;
	}
	public void setConditions(ArrayList<String> conditions) {
		this.conditions = conditions;
	}
	public ArrayList<String> getContraindications() {
		return contraindications;
	}
	public void setContraindications(ArrayList<String> contraindications) {
		this.contraindications = contraindications;
	}
	
	
	


}
