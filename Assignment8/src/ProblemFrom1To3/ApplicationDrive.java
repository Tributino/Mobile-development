package ProblemFrom1To3;
import java.util.ArrayList;
import java.util.Iterator;

import ProblemFrom1To3.Book.BookCategory;

public class ApplicationDrive {

	public static void main(String[] args) {
		
		Page capa = new Page(0,true);
		Page agradecimentos = new Page(1,false);
		Page preface = new Page(2,false);
		Page contents = new Page(3,false);
		Page credits = new Page(4,false);
		Page introduction = new Page(5, true);
		Page cap1 = new Page(6, true);
		
		ArrayList<Page> myBookPages = new ArrayList<Page>();
		
		 myBookPages.add(capa);
		 myBookPages.add(agradecimentos);
		 myBookPages.add(preface);
		 myBookPages.add(contents);
		 myBookPages.add(credits);
		 myBookPages.add(introduction);
		 myBookPages.add(cap1);
		 
		// ArrayList is iterable, so let's go make some tests of our above list
		System.out.println("Using Iterator in a list");
		Iterator<Page> it = myBookPages.iterator();
		 
		while(it.hasNext()) {
			Page p = it.next();
			if(p.isHasImage()) {
				System.out.print(p.getPageNumber() + ",");
			}
		}
			 
		 
		 System.out.println("\nUsing for loop in a list");
		 for(Page p : myBookPages) {
			 if(p.isHasImage()) {
				 System.out.print(p.getPageNumber() + ",");
			 }
		 }
		 
		 System.out.println("\nMaking a class be Iterable");
		 
		 // From here we will use the iterator from our class Book. 
		 
		 Book myBook = new Book("Meu Book", BookCategory.HISTORY, myBookPages);
		  
		 SearchBook sB = new SearchBook(myBook);
		 
		 System.out.println("Problem 1");
		 
		 sB.search();
		 
		 // from here we will use Generic Type
		 
		 System.out.println("Problem 2");
		 
		 PagePredicte pp = new PagePredicte();	
		 
		 GenericSearch.search(myBook, pp);
		 
		 
		 System.out.println("Problem 3");
		 ArrayList<Page> pages = GenericSearchList.search(myBook, pp);
		 
		 for(Page p : pages) {
			 int page = p.getPageNumber();
			 System.out.print(page + ",");
		 }

	}

}
