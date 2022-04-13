package P3;

import java.util.Scanner;

public class ClassEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;

		while (isTrue) {
			System.out.println("1.가위 2.바위 3.보");
			int ran = (int) (Math.random() * 3) + 1;
			System.out.println("숫자를 선택하세요:");
			int user = scn.nextInt();

			if (user == 1) {
				if (ran == 2) {
					System.out.println("You lose");
				} else if (ran == 3) {
					System.out.println("You win");
				} else if (ran == 1) {
					System.out.println("Drawn");
				} else {
					if (user == 2) {
						if (ran == 2) {
							System.out.println("Drawn");
						} else if (ran == 3) {
							System.out.println("You lose");
						} else if (ran == 1) {
							System.out.println("You win");
						}
					} else {
						if (user == 3) {
							if (ran == 3) {
								System.out.println("Drawn");
							} else if (ran == 1) {
								System.out.println("You lose");
							} else {
								System.out.println("You win");
							} 
						
						}
					}
				}
			}
		}
	}

}
