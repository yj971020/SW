package ch13;


import java.io.FileReader;

public class FileReaderEx {
	//파일로 부터 2byte 단위로 읽어옴
	public static void main(String[] args) throws Exception {
		/*
		 * 역슬래쉬 \ 두번 해줘야함! 
		 */
		FileReader fr = new FileReader("c:\\temp\\test.txt");
		int c;
		// 파일로 부터 한 글자씩(2byte) 씩 읽어서 int 타입으로 리턴, 끝이면 -1을 리턴 
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
		}
		//자원해제
		fr.close();
	}

}
