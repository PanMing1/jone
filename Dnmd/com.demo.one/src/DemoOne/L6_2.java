package DemoOne;

public class L6_2 {
	public static void main(String[] args) {
		Xa xa = new Xa();
		xa.run();
		Thread t = new Thread(xa);
		t.start();
		for (int i = 0; i < 2; i++) {
			System.out.println("Íâ---------");
		}
	}
}
class Xa implements Runnable{
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("ÄÚ--------");
		}
	}
}