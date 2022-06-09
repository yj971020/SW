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
				System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어 보세요\n0-99");
			System.out.print(count+">>");
			int num=in.nextInt();
			if(num==target) {
				System.out.print("맞았습니다 다시하시겠습니까? (y//n)");
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
				System.out.println("더 높게");
			}else {
				System.out.println("더 낮게");
			}
			count++;
			
		}
		in.close();
	}
}
