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
		
		//try~with resource ����
		// try(AutoCloseable �� ��ü ����) { ��ɹ� ... } catch(Exception e){ }
		// AutoCloseable �� ��ü�� ���� ��ȣ �ȿ� ���� ����
		try (FileInputStream fi=new FileInputStream(src);
				FileOutputStream fo=new FileOutputStream(dest);) {
			
			
			byte[] buf=new byte[1024*10]; //10kb
			while(true) {
				int n= fi.read(buf);  // ���� ũ�� ��ŭ �б�. n �� ���� ���� ����Ʈ
				fo.write(buf,0,n); //buf[0] ���� n ����Ʈ ����
				if(n<buf.length)break;  // ���� ũ�� ���� �۰� ����. ���ϳ��� ����
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"��"+dest.getPath()+"�� �����Ͽ����ϴ�.");
		}catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}

}
