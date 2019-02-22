package ProjectTopic1;


public class ApplicationDriver {
	

	public static void main(String[] args) {
		
		int[] arr = {1,6,6,1,1,2};
		
		Land l = new Land(arr);
		
		TheCastleCompany c = new TheCastleCompany(l);
		
		
		c.numberOfCastles();

		}

	
}
