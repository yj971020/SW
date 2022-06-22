package ch13;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b[]= {5,51,3,4,-1,-24};
		FileOutputStream fout=null;
		try {
			 fout
			= new FileOutputStream("c:\\temp\\test.out");
			for(int i=0;i<b.length;i++) {
				fout.write(b[i]);
			}
			
			fout.close();
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("c:\\temp\\test.out 을 저장했음");
		
		}
	}
}
