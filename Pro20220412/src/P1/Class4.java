package P1;

public class Class4 {
	public static void main(String[] args) {
		// 비교연산자, 논리연산자
		int num1 = 10;
		int num2 = 20;
		
		if(num1 == num2) { // 비교연산자 ==를 사용 num1과 num2를 비교
			System.out.println("두 수는 같습니다.");
		}
		
		if(num1 != num2) { // 부정
			System.out.println("두 수는 같지 않습니다.");
		}
		
		if(num1 >= num2) { // 크거나 같다
			System.out.println(num1+ "이" + num2 + "보다 큽니다");
		}
		num1 = 10;
		num2 = 20;
	//	if((++num1 % 2 ==0) & (num2++ % 2 ==0)) { //&와 &&의차이를 봤는데 &&일경우 거짓으로 판명되면 뒤에 있는건 실행안하고 그대로 출력 ++num1,num2++를했는데 11이라는숫자가 나와서 거짓으로 판명하여 11,20으로 출력
												  //&는 거짓으로 판명이 되어도 모든 연산은 다 하고 출력해줌 
		if((++num1 % 2 ==0) && (num2++ % 2 ==0)) { //넘1과 넘2의 값을 2로 나눴을때 0이라는것은 짝수라는 의미 &&(연산곱 1x1만 출력)and조건부라 두개다 참일때만 참으로 출력 하나라도 틀리면 거짓으로 출력
			System.out.println("두 수는 짝수입니다.");
		} else {
			System.out.println("두 수는 짝수가 아닙니다.");
		}
		System.out.println(num1 + "," + num2);
		
		if((++num1 % 2 ==0) | (num2++ % 2 ==0)) {
	//	if((++num1 % 2 ==0) || (num2++ % 2 ==0)) { // or(연산합 1이 출력이 된다면 무조건 출력)조건부라서 하나라도 참이면 참으로 출력
			System.out.println("두 수는 중에 하나는 짝수.");
		} else {
			System.out.println("두 수가 다 홀수입니다.");
		}
		System.out.println(num1 + "," + num2);
		
		System.out.println("프로그램 종료");
	}

}
