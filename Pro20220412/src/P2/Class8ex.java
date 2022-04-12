package P2;

public class Class8ex {
	public static void main(String[] args) {
		int num = 99;
		
		//2의 배수인지, 3의 배수인지, 2와 3의 공통배수인지
		//12는 2와 3의 공통배수입니다를 출력하게
		if((num % 2 ==0) && (num % 3 ==0)) { //and연산자
			System.out.println(num + "은 2,3의 공통배수입니다");
		} else if(num % 2 ==0) {
			System.out.println(num + "은 2의배수입니다");
		} else if(num % 3 ==0) {
			System.out.println(num + "은 3의 배수입니다");
		} else {
			System.out.println(num + "은 2와 3의 배수가 아님");
		}
	}
}
