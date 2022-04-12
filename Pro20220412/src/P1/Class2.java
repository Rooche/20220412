package P1;

public class Class2 {
		public static void main(String[] args) {
			//증감연산자
			int num1 = 10;
			int num2 = 20;
			num1 = num1 + 2; //num1의 값을 읽고 처리된 결과값을 다시 대입.
			num1 = num1 + 2; //원래는 10이라는 값이였지만 밑에 변수를 둬서 오른쪽에서 계산하고 왼쪽으로 다시 넣음
			System.out.println(num1);
			
			num1 = num1 + 1; // num1의 값에 1을 더하여 왼쪽에 num1에 대입
			num1 += 1; //원래 num1값에 1을 더할수있음
			num1++; //1을 누적연산
			System.out.println(num1); // 여기까지는 17
			System.out.println(num1++); //출력처리를 하고 +1을 증가시킴
			System.out.println(num1); // 18이 출력이됨
			
			System.out.println(++num1); // +1을 증가시키고 출력처리를 함 19
			
			int result = num1++ + ++num2; //앞의 연산때문에 num1은 19 num2는 20의 값이지만 먼저 +1을 증가시켜서 21 => 19 + 21 = 40
			System.out.println(result + ",num1:" + num1 + ",num2:" + num2);
			
			byte num3 = 10; // byte < short < int < long
			num3 = (byte) (num3 + 1); // 정수연산 int타입으로 처리. int+int =int타입으로 나와야함 int연산의값을 byte타입에 넣으려고해서 오류가 남
									  // 그래서 casting을해줘야함 마우스를 대고 가만히 있으면 가능
			num3 += 1;
			num3++;
			
			num3 = -125;
			num3--; //-126
			num3--; //-127
			num3--; // 128
			num3--; // 127
			num3--; // 126
			
		//	num3 = 125; //여기 125를 먼저해서 밑에 설명한것
		//	num3++; // 126
		//	num3++; // 127 byte의 최대 출력가능한 수치
		//	num3++; // -128
		//	num3++; // -127
		//	num3++; // -126
			System.out.println(num3); // num++은 -126으로 출력 , num--는 126으로 출력 
			
		}
}
