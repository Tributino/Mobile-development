
public class MainClass {

	public static void main(String[] args) {
		
		PatternProvider patternProvider = new PatternProvider();
		ServiceRequester service = new ServiceRequester();
		patternProvider.setDelegate(service);
		patternProvider.draw();

	}

}
