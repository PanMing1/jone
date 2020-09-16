package filedemo;

public class Demo01 {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		int[] i = {1,2,3};
		int y = 5;
		for (int j : i) {
			System.out.println(j+"^^"+ (y+1));
		}
	}
}
