package P1;

public class Class7 {
	public static void main(String[] args) {
		int Score = 85;
		
		// 90점보다 크면 A학점, 80보다 크면 B학점, 70보다 크면 C학점 나머지는 F
		if(Score >= 90) {
			System.out.println("A학점");
		} else if(Score >= 80) {
				System.out.println("B학점");
		} else if(Score >= 70) {
				System.out.println("C학점");
		} else {
				System.out.println("F학점");
		}
		//구분
		if (Score >= 90) {
			System.out.println("A학점");
		}
		if (Score >= 80) {
			System.out.println("B학점");
		}
		if (Score >= 70) {
			System.out.println("C학점");
		}
		if (Score < 70) {
			System.out.println("F학점");
		}
	}

}
