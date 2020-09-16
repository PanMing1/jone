package szbasis;

import java.util.Arrays;

public class Demo7 {
	public static void main(String[] args) {
		Object[] a0 = {"id","station_code","station_name","create_time"};
		Object[] a1 = {1,"C000225WRKSTA0001","2轮对轴箱拆解工位","2019-08-22"};
		Object[] a2 = {2,"C000225WRKSTA0002","3轮对清洗/脱漆工位","2019-09-22"};
		Object[] a3 = {3,"C000225WRKSTA0005","4齿轮箱油洗工位","2019-10-22"};
		Object[][] b = new Object[4][];
		b[0] = a0;
		b[1] = a1;
		b[2] = a2;
		b[3] = a3;
		for (int i = 0; i < b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
