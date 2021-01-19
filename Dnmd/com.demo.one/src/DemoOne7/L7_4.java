package DemoOne7;

import java.io.*;

public class L7_4 {
	public static void main(String[] args) throws Exception {
		ByteArrayOutputStream a = new ByteArrayOutputStream();
		DataOutputStream b = new DataOutputStream(a);
		long c = 123456789;
		String h = "\"苏木吃过\",\"牛气冲天\",\"马到成功\"";
		b.writeLong(c);
		b.writeUTF(h);
		byte d[] = a.toByteArray();
		ByteArrayInputStream e = new ByteArrayInputStream(d);
		DataInputStream f = new DataInputStream(e);
		long g;
		g = f.readLong();
		String j;
		j = f.readUTF();
		System.out.println(g);
		System.out.println(j);
	}
}
