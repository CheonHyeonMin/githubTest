import java.util.Random;
import java.util.Scanner;

public class Ex10_29번 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int count=0;
		while(true) {
			int a=rd.nextInt(10);
			int b=rd.nextInt(10);
			System.out.print(a + "+" + b + "=");
			int c=sc.nextInt();
			if(a+b ==c) {
				System.out.println("SUCCESS!");
			}
			else {
				count++;
				System.out.println("Fail...");
				if(count==5) {
					System.out.println("GAME OVER!");
					break;
				}
				
				
			}
		}
		

	}

}
