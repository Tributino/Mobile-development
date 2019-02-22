
abstract class DelegateInterface {
	
	abstract public char character();
	abstract int  numberOfLines();
	abstract String pattern();
	public int numberOfSpaceBetweenCharacter() {
		return 0;
	}
	public int numberOfEmptyLineBetweenlines() {
		return 0;
	}
	

}
