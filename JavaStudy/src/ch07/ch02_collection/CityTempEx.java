package ch07.ch02_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityTempEx {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();
		map.put("서울", 30);
		map.put("뉴욕", 40);
		map.put("도쿄", 35);
		map.put("베이징", 33);

		while (true) {
			System.out.print("도시명 입력>> ");
			String city = in.next();

			if (city.equals("exit")) {
				System.out.println("종료");
				break;
			} else {
				if (!map.containsKey(city)) {
					System.out.println("없는 도시명");
					continue;
				} else {
					System.out.println(map.get(city));
				}
			}
		}
		in.close();

	}

}
