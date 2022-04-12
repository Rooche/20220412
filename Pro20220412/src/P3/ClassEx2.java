package P3;

import java.util.Scanner;

public class ClassEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int ran = (int)(Math.random() * 3) + 1;
		boolean isTrue = true;
		int a, b, c;
				
		while(isTrue) {
			System.out.println("1.가위 2.바위 3.보");
			int user = scn.nextInt();
			if (user == ran) {
				System.out.println("비겼다");
				break;
			}
		}
		
	}

}
