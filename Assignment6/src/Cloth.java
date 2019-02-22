package Assignment6;

public class Cloth extends Product {

	Material[] ClothMaterials;

	public Cloth(int productId, String productName, float productPrice, String productMadeInCountry,
			Material[] clothMaterials) {
		super(productId, productName, productPrice, productMadeInCountry);
		ClothMaterials = clothMaterials;
	}

	public Material[] getClothMaterials() {
		return ClothMaterials;
	}

	public void setClothMaterials(Material[] clothMaterials) {
		ClothMaterials = clothMaterials;
	}
	
	
}
