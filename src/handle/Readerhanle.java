package handle;
import java.util.List;

import entity.HamNhap;
import entity.Reader;

public class Readerhanle implements HamNhap<Reader>{

	@Override
	public void insert(Reader ob, List<Reader> objs) {
		objs.add(ob);
		
	}

	@Override
	public void delete(int id, List<Reader> objs) {
		for (Reader o : objs) {
			if(o.getId()==id) {
				objs.remove(o);
			}
			
		}
		
	}

	@Override
	public void update(Reader object, List<Reader> objs) {
		for (Reader o : objs) {
			if(o.getId()==object.getId()) {
				o.setName(object.getName());
				o.setBirthDate(object.getBirthDate());
			}
			break;
		}
		
		
		
	}
	

}
