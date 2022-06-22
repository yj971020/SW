package ch13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fout=null;
		int c;
		//버퍼 만들기
		char[] cbf=new char[100];
		try {
			fout=new FileWriter("c:\\Temp\\test.txt");
			while((c=in.read(cbf))>0) {
				//String 객체로 쓰기
				fout.write(new String(cbf,0,c));
			}
			in.close();
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
	}

}
