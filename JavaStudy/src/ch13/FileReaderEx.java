package ch13;


import java.io.FileReader;

public class FileReaderEx {
	//���Ϸ� ���� 2byte ������ �о��
	public static void main(String[] args) throws Exception {
		/*
		 * �������� \ �ι� �������! 
		 */
		FileReader fr = new FileReader("c:\\temp\\test.txt");
		int c;
		// ���Ϸ� ���� �� ���ھ�(2byte) �� �о int Ÿ������ ����, ���̸� -1�� ���� 
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
		}
		//�ڿ�����
		fr.close();
	}

}
