package Demo01;

public class DemoFor {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				int sum = i * j;
				System.out.print(j+"¡Á"+i+"="+sum+"\t");
			}
			System.out.println();
		}
	}
}
