import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 :" );
		int current = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		int temp=0;
		for(int i =1; i<=7; i++) {
			System.out.println(i + "주차 감량 몸무게 :");
			int a= sc.nextInt();
			temp+=a;
		}
		int b= current-temp;
		if(b<goal) {
			System.out.println(b+ "kg 달성 !! 축하합니다!");
		}
		else {
			System.out.println(" 더 빼");
		}

	}

}
