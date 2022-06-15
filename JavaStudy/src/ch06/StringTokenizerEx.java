package ch06;

import java.util.StringTokenizer; //import 하여 사용. util 에 존재

public class StringTokenizerEx {
	public static void main(String[] args) {
		String query="name=kitae&addr=서울&age=18";
		StringTokenizer st=new StringTokenizer(query,"&");
		
		//StringTokenizer 는 소모성 객체 
		// : nextToken 하면 남은 Token 갯수 들어든다.
		System.out.println(st.countTokens()); 
		while(st.hasMoreElements()){
		System.out.println(st.nextToken());//-1 에서 시작하여 0부터 돈다
		System.out.println(st.countTokens()+" 개의 토큰 남음"); 
		}
		
		
		st=new StringTokenizer(query,"&");
		System.out.println(st.countTokens()+" 개의 토큰 남음");
		System.out.println();
		//https://www.naver.com 사이트에 name=kitae&addr=서울&age=18 의 회원정보를 요청
		query="https://www.naver.com?name=kitae&addr=서울&age=18";
		
		st=new StringTokenizer(query,"?&=");
		while(st.hasMoreElements()){
			System.out.println(st.nextToken());//-1 에서 시작하여 0부터 돈다
			System.out.println(st.countTokens()+" 개의 토큰 남음"); 
			}
		
	}

}
