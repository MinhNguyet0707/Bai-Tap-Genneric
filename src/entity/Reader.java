package entity;

public class Reader {
	private int id;
	private String name;
	private String birthDate;

	public Reader(int id, String name, String birthDate) {

		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Reader [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
