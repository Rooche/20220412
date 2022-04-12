package P3;

import java.util.Scanner;

public class Class16whlieex2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0;
		
		//200이 넘게되면 반복문을 빠져나오도록
		while(isTrue) {
			System.out.println("숫자를 입력하세요 200이상이면 멈춥니다");
			int temp = scn.nextInt();
			if (temp == 200) {
				isTrue = false;
				continue;
			}
			sum += temp;
		}
		System.out.println("결과: " + sum);
	}

}
