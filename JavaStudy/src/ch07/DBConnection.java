package ch07;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class DBConnection {
	public static void main(String[] args) {
		
		try{
			Properties pro = new Properties();
			// 파일로 부터 값 읽어들이는 통로 개설
			//경로명 주의 ( 지금은 src 바로 밑에 있기 때문에 가능)
			Reader reader = new FileReader("src/jdbc.properties");
			// 통로를 통해서 전체를 한번에 읽어들이기 load()
			pro.load(reader);
			
			//Properties 객체에 저장된 Key 와 값 읽기
			String driver=pro.getProperty("driver"); //dirver 키에 해당하는 값 가져온다.
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
