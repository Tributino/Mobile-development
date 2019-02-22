package ProblemFrom1To3;

public class PagePredicte implements Predicate<Page> {
	
	

	@Override
	public boolean evaluate(Page p) {
		return p.isHasImage();
	}

}
