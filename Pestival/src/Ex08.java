import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp=0;
		while(true) {
			
			System.out.print("A 입력 :");
			int a = sc.nextInt();
			System.out.print("B 입력 :");
			int b = sc.nextInt();
			if(a!=0 ||b!=0) {
				temp=a-b;
				System.out.print("결과 : >>"+temp);
			}
			
			else if(a==0 && b==0) {
				break;
			}
			System.out.println(" ");
		}

	}

}
