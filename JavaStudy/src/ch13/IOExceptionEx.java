package ch13;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionEx {
	public static void main(String[] args) {
		FileReader fin=null;
		try {
			//FileNotFoundException ���� �߻� ����
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			//���۸� ����� ����
			char[] cbuf=new char[1024];
			//fin.read() �κп��� IOException �߻� ����
			while((c=fin.read(cbuf))>0) {
				System.out.println("cubf �� ����� ������ �� : "+c);
				System.out.print((new String(cbuf,0,c)));
			}
			//�б� ������ �ݾ������!!
			fin.close();
			
		}catch(IOException e) {  
			e.printStackTrace();
		}
	}

}
