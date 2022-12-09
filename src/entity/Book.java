package entity;

public class Book {
	private int id;
	private String name;
	private String author;
	private String date;

	public Book(int id, String name, String author, String date) {

		this.id = id;
		this.name = name;
		this.author = author;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", date=" + date + "]";
	}

}
