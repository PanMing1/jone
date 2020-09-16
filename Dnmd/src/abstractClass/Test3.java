package abstractClass;

public class Test3 {
	public static void main(String[] args) {
//		Student s = new Student("ddd");
		Student s = new Sxtstu();
		s.study();
		s.exam();
	}
}

class Sxtstu extends Student{

	@Override
	public void study() {
		System.out.println("1");
		
	}

	@Override
	public void exam() {
		System.out.println("2");
		
	}
	
}