package DemoOne;

public class L6_8 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Chep1());
		t1.setName("����");
		t1.start();
		Thread t2 = new Thread(new Chep1());
		t2.setName("��ɽ");
		t2.start();
	}
}

class Chep1 implements Runnable {
	private static int ticke = 100;

	@Override
	public void run() {
		while (true) {	
				if (ticke > 0) {
					System.out.println("�̣߳�{" + Thread.currentThread().getName() + "}���˵ڡ�" + (101 - ticke) + "���ų�Ʊ");
					--ticke;
				} else {
					break;
				}
		}
	}
}