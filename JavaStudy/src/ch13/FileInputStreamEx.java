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
				b[n] = (byte) c; // 읽은 바이트를 배열에 저장
				n++;
			}
			System.out.println("c:\\temp\\test.out 에서 읽은 배열을 출력합니다.");
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
			fin.close();
		} catch (IOException e) {

		}
	}

}
