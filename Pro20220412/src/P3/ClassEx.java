package P3;

import java.util.Scanner;

public class ClassEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ran = (int) (Math.random() * 6) + 1;
		int user;
		boolean isTrue = true;

		while (isTrue) {
			System.out.println("입력하세요");
			user = scn.nextInt();
			if (user == ran) {
				System.out.println("정답");
				break;
			}
		}
	}
}
