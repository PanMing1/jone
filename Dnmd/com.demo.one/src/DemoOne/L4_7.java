package DemoOne;

import java.lang.reflect.Method;

public class L4_7 {
	public static void main(String[] args) {
//		Aa<String> a1 = new Aa<String>("222"); 
		Aa<Ab> a1 = new Aa<Ab>(new Ab());
		a1.Aaa();
	}
}
class Aa<L>{
	private L l;

	public Aa(L l) {
		super();
		this.l = l;
	}
	public void Aaa() {
		System.out.println("¿‡–Õ"+l.getClass().getCanonicalName());
		Method aaa[] = l.getClass().getDeclaredMethods();
		for (int i = 0; i < aaa.length; i++) {
			System.out.println(aaa[i].getName());
		}
	}
}
class Ab{
	private void b1() {
		System.out.println("111111111");
	}
	private int b2(int a,int b) {
		return a+b;
	}
}