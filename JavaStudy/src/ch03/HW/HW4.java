package ch03.HW;

import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int target=(int)(Math.random()*100);
		int count=1;

		while (true)
		{
			if(count==1)
				System.out.println("Up & Down �����Դϴ�. ������ ���� ���߾� ������\n0-99");
			System.out.print(count+">>");
			int num=in.nextInt();
			if(num==target) {
				System.out.print("�¾ҽ��ϴ� �ٽ��Ͻðڽ��ϱ�? (y//n)");
				String again=in.next();
				if(again.equals("y")) {
					count=1;
					target=(int)(Math.random()*100);
					continue;
				}else if(again.equals("n")){
					break;
				}
			}
			else if(target>num) {
				System.out.println("�� ����");
			}else {
				System.out.println("�� ����");
			}
			count++;
			
		}
		in.close();
	}
}
