import java.util.Scanner;

public class Ex05_16번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		int temp=a;
		int sum=0;
		while(temp>0) {
			
				sum+=temp%10;
				temp=temp/10;
		}
		System.out.println(sum);
		
	}

}
