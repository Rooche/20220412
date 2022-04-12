package P2;

import java.util.Scanner;

public class Class11ex {
	public static void main(String[] args) {
	//	Scanner scn = new Scanner(System.in);
		
		int randomVal = (int) (Math.random()*50) + 51; //math랜덤값이 0~1사이의 숫자인데 *50을 하면 1 ~ 50까지의 숫자가 나오며 + 51해서 1 ~ 100까지의 숫자가 나오게 된다 ..?
		System.out.println(randomVal);
		
		// 임의 값 : Math.random()
		// 51 ~ 100까지의 임의 값을 생성
		randomVal /= 10; //randomvalue = randomval / 10;
		
		
		// 100 ~ 90 => A학점, ~80 => B학점, ~70 => C학점, ~60 => D학점, 나머지 F학점 
		switch(randomVal) {
		case 11 :
		case 10 : System.out.println("A학점"); break;
		case 9 : System.out.println("B학점"); break;
		case 8 : System.out.println("C학점"); break;
		case 7 : System.out.println("D학점"); break;
		default:
			System.out.println("F학점");
		}
	}
}
