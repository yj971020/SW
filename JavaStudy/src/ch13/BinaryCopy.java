package ch13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {
	public static void main(String[] args) {
		File src=new File("c:\\temp\\img.png");
		File dest=new File("c:\\temp\\back.png");
		int c;
		
		//try~with resource 구문
		// try(AutoCloseable 한 객체 선언) { 명령문 ... } catch(Exception e){ }
		// AutoCloseable 한 객체만 저기 괄호 안에 선언 가능
		try (FileInputStream fi=new FileInputStream(src);
				FileOutputStream fo=new FileOutputStream(dest);) {
			
			
			byte[] buf=new byte[1024*10]; //10kb
			while(true) {
				int n= fi.read(buf);  // 버퍼 크기 만큼 읽기. n 은 실제 읽은 바이트
				fo.write(buf,0,n); //buf[0] 부터 n 바이트 쓰기
				if(n<buf.length)break;  // 버퍼 크기 보다 작게 읽음. 파일끝에 도달
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"를"+dest.getPath()+"로 복사하였습니다.");
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
