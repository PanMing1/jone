package DemoOne;

public class L6_12 {
	public static void main(String[] args) {
		Workshop wo = new Workshop();
		OperationSc sc = new OperationSc(wo);
		OperationXf xf = new OperationXf(wo);
		Thread t1 = new Thread(sc);
		t1.start();
		Thread t2 = new Thread(xf);
		t2.start();
	}
}

class Workshop {
	int[] sp = new int[5];
	int wp = 0;

	public synchronized void produce(char aa) {
		if (wp == sp.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {

			}
		}
		this.notify();
		sp[wp] = aa;
		++wp;
		System.out.println("正在（生产）-----【" + wp + "】号，名称是【" + aa + "】");
	}

	public synchronized void consumption() {
		char aa;
		if (wp == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {

			}
		}
		this.notify();
		aa = (char) sp[wp - 1];
		System.out.println("正在（消费）-----【" + wp + "】号，名称是【" + aa + "】");
		--wp;
	}
}

class OperationSc implements Runnable {
	private Workshop wo = null;

	public OperationSc(Workshop wo) {
		super();
		this.wo = wo;
	}

	@Override
	public void run() {
		char aa;
		for (int i = 0; i < 26; i++) {
			aa = (char) ('A' + i);
			wo.produce(aa);
		}
	}
}

class OperationXf implements Runnable {
	private Workshop wo = null;

	public OperationXf(Workshop wo) {
		super();
		this.wo = wo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 26; i++) {
			wo.consumption();
		}
	}
}
