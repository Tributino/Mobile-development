package ProblemFrom1To3;
import java.util.ArrayList;
import java.util.Iterator;

public class Book implements Iterable<Page> {
	
	public enum BookCategory {
		SCIENCE,
		HISTORY,
		FOOD,
		IT,
		ENGEGINEERING,
		NOVEL,
}
	
	private String title;
	private BookCategory category;
	private ArrayList<Page> pages;
	
	
	
	
	
	public Book(String title, BookCategory category, ArrayList<Page> pages) {
		this.title = title;
		this.category = category;
		this.pages = pages;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BookCategory getCategory() {
		return category;
	}
	public void setCategory(BookCategory category) {
		this.category = category;
	}
	
	@Override
	public Iterator<Page> iterator() {
		
		return new BookIterator(this.pages);
	}

}
