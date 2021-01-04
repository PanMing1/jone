package DemoOne;

public class L6_4 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Xc());
		Thread t2 = new Thread(new Xd());
		t2.setPriority(Thread.NORM_PRIORITY + 5);
		t1.start();
		t2.start();
	}
}
class Xc implements Runnable{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("线程1+++++"+i);
		}
	}
}
class Xd implements Runnable{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("线程2--------"+i);
		}
	}
}