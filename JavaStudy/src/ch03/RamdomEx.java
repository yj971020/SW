package ch03;

import java.util.Random;

public class RamdomEx {
	public static void main(String[] args) {
		//1,2,3 랜덤
		//Math.random 사용
		System.out.println((int)(Math.random()*3)+1);
		
		/*
		 * Random 클래스 사용
		 * import 필요 
		 * 객체.nextInt(정수);  --> 0부터 정수 미만의 값 랜덤
		 */
		
		//seed 없이 생성(Random())
		Random r= new Random();
		System.out.println(r.nextInt(10));  //0부터 10미만
		
		//seed 가지고 생성(Random(시드)) : 계속 같은 값만 나옴
		Random k= new Random(5);
		System.out.println(k.nextInt());  //0부터 10미만
		
		//seed 가지고 생성(Random(시드)) : 계속 같은 값만 나옴
		Random m= new Random(5);
		System.out.println(m.nextInt());  //0부터 10미만
		
		//랜덤상황이 같아야 할때 시드를 사용
		//랜덤상황을 재현? 
		//마다 고유값이 있다고 생각하면 됨
		
	}
}
