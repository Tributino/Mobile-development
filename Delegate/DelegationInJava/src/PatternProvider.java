

public class PatternProvider{
	
	private DelegateInterface delegate;
	

	public DelegateInterface getDelegate() {
		return delegate;
	}

	public void setDelegate(DelegateInterface delegate) {
		this.delegate = delegate;
	}
	
	private String turnToString() {
		int nSpace = delegate.numberOfSpaceBetweenCharacter();
		char character = delegate.character();
		String newString = Character.toString(character);
		if (nSpace>0) {
			for(int i=0;i<nSpace;i++) {
				newString = newString + " ";
			}
		}
		
		return newString;
	}
	
	
	private void printStar(int n){
	    if(n > 0){
	        System.out.print(turnToString());
	        printStar(n-1);
	    }
	}
	
	public void draw() {
		int nlines = delegate.numberOfEmptyLineBetweenlines();
		int numberOfLines = delegate.numberOfLines();
		String pattern = delegate.pattern();
		
		
		
		if (pattern == "Triangle") {
			for(int i=1; i<numberOfLines;i++) {
				printStar(i);
				for(int j=0;j<nlines;j++ ) {
					System.out.print("\n");
				}
				
				}
		}
		
		if (pattern == "ReversedTriangle") {
			for(int i=numberOfLines; i>0;i--) {
				printStar(i);
				for(int j=0;j<=nlines;j++ ) {
					System.out.print("\n");
				}
				}
		}
		
	}
	
}
