package DemoOne;

public class L6_3 {
	public static void main(String[] args) {
		Xb x1 = new Xb();
		x1.setName("�߳�һ");
		x1.start();
		
		Xb x2 = new Xb();
		x2.setName("�̶߳�");
		x2.start();
		
		Xb x3 = new Xb();
		x3.setName("�߳���");
		x3.start();
		
		System.out.println("����ִ��-----"+Thread.currentThread().getName());
	}
}
class Xb extends Thread{
	public void run() {
		System.out.println("����ִ��-----"+Thread.currentThread().getName());
	}
}