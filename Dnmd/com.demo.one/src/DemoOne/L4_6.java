package DemoOne;

import java.util.ArrayList;

public class L4_6 {
	public static void main(String[] args) {
		ArrayList<Pa> al = new ArrayList<Pa>();
		Pa pa1 = new Pa(1,"Íø",14.13);
		al.add(pa1);
		Pa pa2 = al.get(0);
//		Pb pb2 = al.get(0);
	}
}
class Pa{
	private int num;
	private String name;
	private double code;
	public Pa() {
	}
	public Pa(int num, String name, double d) {
		super();
		this.num = num;
		this.name = name;
		this.code = d;
	}
}
class Pb{
	private int aa;
	private String bb;
	public Pb(int aa, String bb) {
		super();
		this.aa = aa;
		this.bb = bb;
	}
	
}