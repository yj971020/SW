package ch13;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte[] b = new byte[6];
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\temp\\test.out");
			int n = 0, c;
			while ((c = fin.read()) != -1) {
				b[n] = (byte) c; // ���� ����Ʈ�� �迭�� ����
				n++;
			}
			System.out.println("c:\\temp\\test.out ���� ���� �迭�� ����մϴ�.");
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
			fin.close();
		} catch (IOException e) {

		}
	}

}
