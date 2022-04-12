package P2;

public class Class9ex {
	public static void main(String[] args) {
		// 중첩 구문
		// 90점 이상이면 A학점, 80점 이상이면 B학점, 70점 이상이면 C학점, 나머지 F학점
		int Score = 88;
		
		if(Score >= 95) {
			System.out.println("A+학점");
		} else if(Score >= 90) {
			System.out.println("A학점");
		} else if(Score >= 85) {
			System.out.println("B+학점");
		} else if(Score >= 80) {
			System.out.println("B학점");
		} else if(Score >= 70){
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
	}

}
