package P1;

public class Class6 {
	public static void main(String[] args) {
		int num = 8;
		
	//	int result = num << 2; // 비트연산자, 0 0 0 0 1 0 0 0의 값(8)에서 왼쪽으로 2칸 이동하겠다는표시
							   // 0 0 1 0 0 0 0 0로 (32)됨
		int result = num >> 2; // 오른쪽으로 2칸 이동 0 0 0 0 1 0 0 0의 값(8)에서 0 0 0 0 0 0 1 0의 값(2)가 됨
		System.out.println(result);
		
	}

}
