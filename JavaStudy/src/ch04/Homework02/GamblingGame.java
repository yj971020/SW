package ch04.Homework02;

import java.util.Scanner;

class Player2{
	private String name;
	Player2(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
public class GamblingGame {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Player2[] p = new Player2[2];
		for( int i=0;i<2;i++) {
			System.out.print("�����̸� �Է�>> ");
			p[i]=new Player2(in.next());
		}
		int n=0;
		while(true) {
			System.out.print(p[n].getName()+" <Enter �� �ƹ�Ű�� ġ����>");
			
			in.next();
			int[] val=new int[3];
			for(int i=0;i<val.length;i++) {
				val[i]=(int)(Math.random()*3);
				System.out.print(val[i]+"\t");
			}
			System.out.println();
			if(val[0]==val[1]&&val[1]==val[2]) {
				System.out.println(p[n].getName()+"��, �¸��ϼ̽��ϴ�.");
				break;
			}
			n++;
			n=n%2;	
		}
		in.close();
	}
}
