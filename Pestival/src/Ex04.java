import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int don = sc.nextInt();
		System.out.println("잔돈 : " + don);
		if(don>10000) {
			System.out.println(don/10000);
		}
		if(don>5000) {
			System.out.println(don%10000/5000);
		}
		if(don>1000) {
			System.out.println(don%10000%5000/1000);
		}
		if(don>500) {
			System.out.println(don%10000%5000%1000/500);
		}
		if(don>100) {
			System.out.println(don%10000%5000%1000%500/100);
		}
		
	}

}
