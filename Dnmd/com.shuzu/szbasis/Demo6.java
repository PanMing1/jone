package szbasis;

public class Demo6 {
	public static void main(String[] args) {
		int[][] a = new int[3][];
		System.out.println(a[0]);
		int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt(myArray);
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + " ");
        }
	}
}
class ChangeIt{
	static void doIt(int[] z) {
//		int[] A = z;
//		A[0] = 99;
		z = null;
	}
}