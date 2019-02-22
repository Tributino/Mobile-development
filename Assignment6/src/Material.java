package Assignment6;

public class Material {

	int materialcode;
	String materialName;
	
	
	
	
	public Material(int materialcode, String materialName) {
		this.materialcode = materialcode;
		this.materialName = materialName;
	}
	public int getMaterialcode() {
		return materialcode;
	}
	public void setMaterialcode(int materialcode) {
		this.materialcode = materialcode;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	
}
