package ch07.ch02_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityTempEx {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();
		map.put("����", 30);
		map.put("����", 40);
		map.put("����", 35);
		map.put("����¡", 33);

		while (true) {
			System.out.print("���ø� �Է�>> ");
			String city = in.next();

			if (city.equals("exit")) {
				System.out.println("����");
				break;
			} else {
				if (!map.containsKey(city)) {
					System.out.println("���� ���ø�");
					continue;
				} else {
					System.out.println(map.get(city));
				}
			}
		}
		in.close();

	}

}
