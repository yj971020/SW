package ch06;

import java.util.StringTokenizer; //import �Ͽ� ���. util �� ����

public class StringTokenizerEx {
	public static void main(String[] args) {
		String query="name=kitae&addr=����&age=18";
		StringTokenizer st=new StringTokenizer(query,"&");
		
		//StringTokenizer �� �Ҹ� ��ü 
		// : nextToken �ϸ� ���� Token ���� �����.
		System.out.println(st.countTokens()); 
		while(st.hasMoreElements()){
		System.out.println(st.nextToken());//-1 ���� �����Ͽ� 0���� ����
		System.out.println(st.countTokens()+" ���� ��ū ����"); 
		}
		
		
		st=new StringTokenizer(query,"&");
		System.out.println(st.countTokens()+" ���� ��ū ����");
		System.out.println();
		//https://www.naver.com ����Ʈ�� name=kitae&addr=����&age=18 �� ȸ�������� ��û
		query="https://www.naver.com?name=kitae&addr=����&age=18";
		
		st=new StringTokenizer(query,"?&=");
		while(st.hasMoreElements()){
			System.out.println(st.nextToken());//-1 ���� �����Ͽ� 0���� ����
			System.out.println(st.countTokens()+" ���� ��ū ����"); 
			}
		
	}

}
