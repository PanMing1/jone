package Demo01;

class Outer{
	private int a= 10;
	private static int b= 20;
	static class OuterTest1{
		public void test() {
//			System.out.println(a); 
//			Cannot make a static reference to the non-static field a
//			�޷���̬���÷Ǿ�̬�ֶ�
			System.out.println(b);
		}
	}
}

public class TestOuter {
	public static void main(String[] args) {
		Outer.OuterTest1 c = new Outer.OuterTest1();
		c.test();
	}
}
