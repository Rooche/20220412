package P3;

public class Class12loop {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			sum = sum + 3;
			// i = 1 ,sum이 원래는 0이였으니깐 0 + 3이 되어 sum의 값이 3이됨 sum = 3;
			// i = 2 ,sum은 3의 값이 되어있었지만 한번 더 증가하였으므로 sum = 6;
			// i = 3 ,  ' ' ' '  sum = 9;
			// i = 4 , . . . . . sum = 12;
			// i = 5 , . . . . . sum = 15;
		}
		
		System.out.println("sum =>" + sum);
		
		//반복문 for을 써서 곱하기를 만들고 i에 1을 주고 i의 값이 9가 될때까지 계속 반복하는 곱셈
		
	//	for(int i=1; i<=1; i++) {  	//반복문 for을 써서 곱하기를 만들고 i에 1을 주고 i의 값이 9가 될때까지 계속 반복하는 곱셈
		for(int i=9; i>=1; i--) {
			System.out.println("3 * " + i + " = " + (3*i));
		}
		
		System.out.println("-----------------------------");
		
		for(int i=1; i<=9; i++) {
			System.out.println("5 x " + i + " = " + (5*i));
		}
		System.out.println("-----------------------------");
		
		
		// sum 1 + 3 + 5 + 7 + 9
		sum = 0;
		
		for(int i=1; i<=9; i+=2) {
			sum = sum + i;
			System.out.println("sum의 값은" + sum);
		}
		
		sum = 0;
		for(int i=1; i <=10; i++) {
			
			if(i % 2 == 0) {
			sum = sum + i;
			}
		}
		
								
	}

}
