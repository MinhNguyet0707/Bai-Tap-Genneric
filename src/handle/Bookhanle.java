package handle;

import java.util.List;

import entity.Book;
import entity.HamNhap;

public class Bookhanle implements HamNhap<Book> {

	@Override
	public void insert(Book object, List<Book> objs) {
		objs.add(object);

	}

	@Override
	public void delete(int id, List<Book> objs) {
		for (Book o1 : objs) {
			if (o1.getId() == id) {
				objs.remove(o1);
			}

		}
	}

	@Override
	public void update(Book object, List<Book> objs) {
		for (Book o : objs) {
			if (o.getId() == object.getId()) {
				o.setName(object.getName());
				o.setAuthor(object.getAuthor());
				o.setDate(object.getDate());
			}
			break;
		}

	}
}
