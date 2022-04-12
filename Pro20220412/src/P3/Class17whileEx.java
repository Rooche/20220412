package P3;

import java.util.Scanner;

public class Class17whileEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//Math.random()의 생성범위 1 ~ 10까지가 되도록 => randomVal
		//사용자의 입력값을 담는 변수 userVal
		
		//while구문을 사용해서 임의의 값이랑 입력 값이 같으면 종료
		//사용자 값 비교 랜덤값이랑 비교를해서 입력한 랜덤값이 크다 또는 작다를 출력할것
		//랜덤이 만들어준 값을 맞추는 게임
		int randomVal = (int) (Math.random() * 10) + 1;
		int userVal;
		boolean isTrue = true;
		
		while(isTrue) {
				System.out.println("입력하세요");
				userVal = scn.nextInt();
				if (userVal == randomVal) {
					System.out.println("정답");
					break;
				}
			 if(randomVal > userVal) {
				 System.out.println("입력값보다 크다");
			 } else {
				 System.out.println("입력값보다 작다");
			 }
		}
		System.out.println("정답은 " + randomVal);
	}

}
