package entity;
import java.util.List;

public class Library {
	private List<Book> books;
	private List<Reader> readers;
	
	public Library(List<Book> books, List<Reader> readers) {
		
		this.books = books;
		this.readers = readers;
	}

	@Override
	public String toString() {
		return "Library [books=" + books + ", readers=" + readers + "]";
	}
	
	
	

}
