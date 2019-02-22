package ProblemFrom1To3;
import java.util.ArrayList;
import java.util.Iterator;


public class BookIterator implements Iterator<Page>  {
	ArrayList<Page> pages;
	int currPosition;
	
	
	public BookIterator(ArrayList<Page> pages) {
		this.pages = pages;
	}
	
	
	@Override
	public boolean hasNext() {
		if(this.currPosition<this.pages.size()) {
			return true;
		}
		return false;
	}
	@Override
	public Page next() {
		if(hasNext()) {
			Page p = this.pages.get(currPosition);
			currPosition+=2;
			return p;
			}
		return null;			
	}
	
	
	

}
