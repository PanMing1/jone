package d1;

public class Person {
	private String name;
	private int age;
	private boolean flae;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 150) {
			System.out.println("²»ºÏ·¨");
		} else {
			this.age = age;
		}
	}

	public boolean isFlae() {
		return flae;
	}

	public void setFlae(boolean flae) {
		this.flae = flae;
	}

}
