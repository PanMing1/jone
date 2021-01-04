package DemoOne;

public class L6_1 {
	public static void main(String[] args) {
		Xo x1 = new Xo();
//		x1.run();
		x1.start();
		for (int i = 0; i < 200; i++) {
			System.out.println("Íâ---------");
		}
//		x1.start();
	}
}
class Xo extends Thread{
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("ÄÚ--------");
		}
	}
}