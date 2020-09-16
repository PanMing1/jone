package string;

public class Tset1 {
	public static void main(String[] args) {
		String str1 = new String("abcdef");
		String str2 = "abcdef";
		System.out.println(str1=str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		int a = str1.length();
		System.out.println(a);
		char b[] = {'2','3','4'};
		String c = new String(b);
		System.out.println(c);
		System.out.println("aljflajfaj".indexOf("flx"));
	}
}
