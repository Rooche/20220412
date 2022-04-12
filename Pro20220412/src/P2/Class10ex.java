package P2;

public class Class10ex {
		public static void main(String[] args) {
			//임의의 값을 생성해주는 math.random()
			int randomVal =(int) (Math.random() * 100) + 1; // 반환해주는 값이 double(실수)값 0<= 값 < 1
			System.out.println(randomVal);
			
			// 생성된 값이 1 ~ 50까지 범위
			// 생성된 값이 51 ~ 60까지 범위
			// 61 ~ 70, 71 ~ 80, 81 ~ 90, 91 ~ 100
			
			System.out.println("1 ~ 50범위 ");
			int ran1 = (int) (Math.random() * 50) + 1;
			System.out.println(ran1);
			
			System.out.println("51 ~ 60범위");
			int ran2 = (int) (Math.random() * 10) + 51;
			System.out.println(ran2);
			
			System.out.println("61 ~ 70범위");
			int ran3 = (int) (Math.random() * 10) + 61;
			System.out.println(ran3);
			
			System.out.println("71 ~ 80범위");
			int ran4 = (int) (Math.random() * 10) + 71;
			System.out.println(ran4);
			
			System.out.println("81 ~ 90범위");
			int ran5 = (int) (Math.random() * 10) + 81;
			System.out.println(ran5);
			
			System.out.println("91 ~ 100범위");
			int ran6 = (int) (Math.random() * 10) + 91;
			System.out.println(ran6);

			
		}
}
