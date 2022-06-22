package ch13;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionEx {
	public static void main(String[] args) {
		FileReader fin=null;
		try {
			//FileNotFoundException 예외 발생 가능
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			//버퍼를 사용한 예제
			char[] cbuf=new char[1024];
			//fin.read() 부분에서 IOException 발생 가능
			while((c=fin.read(cbuf))>0) {
				System.out.println("cubf 에 저장된 문자의 수 : "+c);
				System.out.print((new String(cbuf,0,c)));
			}
			//읽기 끝나면 닫아줘야함!!
			fin.close();
			
		}catch(IOException e) {  
			e.printStackTrace();
		}
	}

}
