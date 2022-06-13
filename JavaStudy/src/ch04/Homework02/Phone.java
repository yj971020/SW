package ch04.Homework02;

import java.util.Scanner;

public class Phone {
	private String name,tel;
	public Phone(String name,String tel) {
		this.name=name;
		this.tel=tel;
	}
	public String getName() {return name;}
	public String getTel() {return tel;}
	
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("이름과 전화번호 입력 >>");
		Phone p1=new Phone(in.next(),in.next());
		System.out.print("이름과 전화번호 입력 >>");
		Phone p2=new Phone(in.next(),in.next());
		
		System.out.println(p1.getName()+"의 번호 "+p1.getTel());
		System.out.println(p2.getName()+"의 번호 "+p2.getTel());
	}
	
}
