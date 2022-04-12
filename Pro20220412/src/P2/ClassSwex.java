package P2;

import java.util.Scanner;

public class ClassSwex {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("피자의 종류를 입력하세요");
		String result = scn.nextLine();
		int price = 0; //금액을 가르키는 변수를 넣음
		switch(result) { //하나의 구문을 하고싶으면 break;를 넣어야함 안넣으면 다음 구문으로 넘어감
		case "콤비네이션": //가격이 같아서 price를 하나만 씀
		//	price = 20000; break;
		case "슈퍼슈프림":
			price = 20000; break;
		case "포테이토":
			price = 15000; break;
		case "쉬림프":
			price = 25000; break;
		default :
			price = 0;
		}
		System.out.println("피자 " + result + "의 값은 " + price);
	}
}
