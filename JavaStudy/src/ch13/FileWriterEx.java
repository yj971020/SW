package ch13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fout=null;
		int c;
		//���� �����
		char[] cbf=new char[100];
		try {
			fout=new FileWriter("c:\\Temp\\test.txt");
			while((c=in.read(cbf))>0) {
				//String ��ü�� ����
				fout.write(new String(cbf,0,c));
			}
			in.close();
			fout.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
		
	}

}
