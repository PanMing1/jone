package szdemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		FileReader reader = null;
		String path = "D:/as/1.txt";
		try {
			reader = new FileReader(path);
			char a = (char) reader.read();
			System.out.println(a);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (reader != null) {
					reader.close();
				} 
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
