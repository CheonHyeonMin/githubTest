import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("일한시간을 입력하세요 : ");
		int nodong = sc.nextInt();
		int a = 5000*8;
		int b= nodong-8;
		int don = (nodong>8) ? a+(int)(b*5000*1.5) : a ;
		System.out.println(don);
	}

}
