package ch13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopy {
	public static void main(String[] args) {
		File src=new File("c:\\temp\\img.png");
		File dest=new File("c:\\temp\\back.png");
		int c;
		FileInputStream fi;
		FileOutputStream fo;
		try {
			fi=new FileInputStream(src);
			fo=new FileOutputStream(dest);
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"를"+dest.getPath()+"로 복사하였습니다.");
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
