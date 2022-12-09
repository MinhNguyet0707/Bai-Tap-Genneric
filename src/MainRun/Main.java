package mainrun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Book;
import entity.Reader;
import handle.Bookhanle;
import handle.Readerhanle;

public class Main {

	public static void main(String[] args) {
		newBook();
		newReader();
	}

	public static void newBook() {
		Scanner sc = new Scanner(System.in);
		List<Book> books = new ArrayList<>();
		Book book1 = new Book(1, "không gia đình", "12/12/1990", "handke");
		Bookhanle bookhanle = new Bookhanle();
		bookhanle.insert(book1, books);
//			bookhanle.insert(book2, books);
		books.forEach(n -> System.out.println(n));
		System.out.println("mời bạn nhập id mới");
		int idU = Integer.parseInt(sc.nextLine());
		System.out.println("mời bạn nhập tên mới");
		String nameU = sc.nextLine();
		System.out.println("mời bạn nhập publicDate mới");
		String dateU = sc.nextLine();
		System.out.println("mời bạn nhập author mới");
		String authorU = sc.nextLine();
		Book bookU = new Book(idU, nameU, authorU, dateU);
		bookhanle.update(bookU, books);
		books.forEach(n -> System.out.println(n));
		try {
			System.out.println("mời bạn nhập id muốn xóa");
			int idD = Integer.parseInt(sc.nextLine());
			bookhanle.delete(idD, books);
			books.forEach(n -> System.out.println(n));

		} catch (Exception e) {
			System.out.println("mảng của bạn đang rỗng");
		}

	}

	public static void newReader() {
		Scanner sc = new Scanner(System.in);
		List<Reader> reader = new ArrayList<>();
		Reader reader1 = new Reader(1, "abc", "12/12/1990");
//			Reader reader2 = new Reader(2, "xyz", "1/12/1990");
		Readerhanle readerhanle = new Readerhanle();
		readerhanle.insert(reader1, reader);
//			readerhanle.insert(reader2, reader);
		reader.forEach(n -> System.out.println(n));
		System.out.println("mời bạn nhập id mới");
		int idU = Integer.parseInt(sc.nextLine());
		System.out.println("mời bạn nhập tên mới");
		String nameU = sc.nextLine();
		System.out.println("mời bạn nhập Date mới");
		String dateU = sc.nextLine();
		Reader reader3 = new Reader(idU, nameU, dateU);
		readerhanle.update(reader3, reader);
		reader.forEach(n -> System.out.println(n));
		try {
			System.out.println("mời bạn nhập id muốn xóa");
			int idD = Integer.parseInt(sc.nextLine());
			readerhanle.delete(idD, reader);
			reader.forEach(n -> System.out.println(n));

		} catch (Exception e) {
			System.out.println("mảng của bạn đang rỗng");
		}

	}

}
