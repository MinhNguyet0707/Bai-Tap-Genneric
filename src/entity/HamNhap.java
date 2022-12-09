package entity;

import java.util.List;

public interface HamNhap<T> {
	void insert(T object, List<T> objs);
	void delete(int id, List<T> objs);
	void update(T object, List<T> objs);

}
