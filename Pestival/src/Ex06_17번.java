import java.util.Scanner;

public class Ex06_17번 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int temp=0;
		String b ="";
		for(int i=1; i<=10; i++) {
			System.out.print(i + "번 째 정수 입력 >>");
			int a=sc.nextInt();
			if(a%3==0) {
				b+=a + " ";
			}
		}
		System.out.println(b);

	}

}
