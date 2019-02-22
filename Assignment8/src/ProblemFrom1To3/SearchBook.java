package ProblemFrom1To3;

public class SearchBook {
	public Book myBook;
	
	public SearchBook(Book myBook) {
		this.myBook = myBook;
	}
	

	public void search() {
		int count = 0;
		for(Page p : myBook) {
			if(p.isHasImage()) {
				count++;	
		    }	
		}	
		System.out.println(count);
		
	}
}
