package DemoOne;

public class L6_3 {
	public static void main(String[] args) {
		Xb x1 = new Xb();
		x1.setName("线程一");
		x1.start();
		
		Xb x2 = new Xb();
		x2.setName("线程二");
		x2.start();
		
		Xb x3 = new Xb();
		x3.setName("线程三");
		x3.start();
		
		System.out.println("正在执行-----"+Thread.currentThread().getName());
	}
}
class Xb extends Thread{
	public void run() {
		System.out.println("正在执行-----"+Thread.currentThread().getName());
	}
}