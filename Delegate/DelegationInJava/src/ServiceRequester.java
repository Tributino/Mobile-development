
public class ServiceRequester extends DelegateInterface {
	
	private PatternProvider pattern;
	
	

	@Override
	public char character() {
		
		return '*';
	}

	@Override
	int numberOfLines() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	String pattern() {
		// TODO Auto-generated method stub
		return "ReversedTriangle";
	}
	
	
	

}
