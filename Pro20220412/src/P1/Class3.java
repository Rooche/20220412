package P1;

public class Class3 {
	public static void main(String[] args) {
		// 10진수 10을 2진수로 표현하면 1010
		int num10 = 10;
		System.out.println(~num10); // -11출력, 
									//0 0 0 1 0 1 0은 10이고 1 1 1 0 1 0 1은 -11로 출력이 된다 여기에 1을 더하여 1 1 1 0 1 1 0으로 만들면 -10이 되는건데 
									//10 + (-10)을 했을때 0이 나오면 제대로 된 계산
		boolean isTure = false;
		isTure = !isTure; // true !는 부정(not)인데 사용하여 true(참)으로 됨
		isTure = !isTure; // false !의 부정값이라 참에서 부정으로 변함
		isTure = !isTure; // true
		isTure = !isTure; // false
	//	System.out.println(isTrue);
		
		if(!(num10 > 5)) {
			System.out.println("참입니다");			
		} else {
			System.out.println("거짓입니다");
		}
		
	}

}
