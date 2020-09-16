package testInterface;

public class SuperMan implements Volant,Honest {

	@Override
	public void a3() {
		System.out.println("3");
		
	}

	@Override
	public void a1() {
		System.out.println("1");
		
	}

	@Override
	public void a2() {
		System.out.println("2");
		
	}
	public static void main(String[] args) {
		SuperMan s1 =new SuperMan();
		s1.a1();
		s1.a2();
		s1.a3();
	}
}
