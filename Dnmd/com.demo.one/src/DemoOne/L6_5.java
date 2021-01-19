package DemoOne;

public class L6_5 {
	public static void main(String[] args) {
		Thread te = new Thread(new Xe());
		te.start();
	}
}
class Xe implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}