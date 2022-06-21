package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		System.out.println("ют╥б>> ");
		while (true) {
			try {
				int c = rd.read();
				if (c == -1) {
					break;
				}
				System.out.print((char) c);
				System.out.print(c);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
