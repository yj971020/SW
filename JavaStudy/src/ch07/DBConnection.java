package ch07;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class DBConnection {
	public static void main(String[] args) {
		
		try{
			Properties pro = new Properties();
			// ���Ϸ� ���� �� �о���̴� ��� ����
			//��θ� ���� ( ������ src �ٷ� �ؿ� �ֱ� ������ ����)
			Reader reader = new FileReader("src/jdbc.properties");
			// ��θ� ���ؼ� ��ü�� �ѹ��� �о���̱� load()
			pro.load(reader);
			
			//Properties ��ü�� ����� Key �� �� �б�
			String driver=pro.getProperty("driver"); //dirver Ű�� �ش��ϴ� �� �����´�.
			System.out.println("driver= "+ driver);
			String url=pro.getProperty("url");
			System.out.println("url= "+url);
			
			Properties pro_ko=new Properties();
			Reader readerKo=new FileReader("src/msg_ko.properties");
			
			Properties pro_en=new Properties();
			Reader readerEn=new FileReader("src/msg_en.properties");
			
			String nation="english";
			switch(nation) {
			case "Korean":
				pro_ko.load(readerKo);
				System.out.println(pro_ko.getProperty("greet"));
				System.out.println("i am "+pro_ko.getProperty("name")); 
				break;
			case "english":
				pro_en.load(readerEn);
				System.out.println(pro_en.getProperty("greet"));
				System.out.println("i am "+pro_en.getProperty("name")); 
				break;
				
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
