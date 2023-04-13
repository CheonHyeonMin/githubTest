import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int temp=0;
		int a = sc.nextInt();
		temp=(a%10 >5) ?  (a/10)*10+10 : a/10*10;
		System.out.print("반올림 수 :"+temp);
	}

}
