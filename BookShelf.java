package BookShelf;

import java.util.ArrayList;

public class BookShelf implements Aggregate{
	private ArrayList books;
	private int last=0;
	
	public BookShelf(int initialsize) {
		this.books=new ArrayList(initialsize);
	}
	
	public Book getBookAt(int index) {
		return (Book)books.get(index);
	}
	
	public void appendBook(Book book) {
		this.books.add(book);
		last++;
	}
	public int getLength() {
		return books.size();
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	

}
