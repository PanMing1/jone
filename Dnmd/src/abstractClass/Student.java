package abstractClass;

public abstract class Student {
	private int id;
	private String name; 
	
	public abstract void study();
	public abstract void exam();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
