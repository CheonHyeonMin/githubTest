import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c= 1;
		int [][] a = new int[b][b];
		for(int i=0; i<=b; i++) {
			for(int j=0; j<=b; j++) {
				a[i][j]= c;
				c++;
				System.out.println(a[i][j]);
			}
		}
		

	}

}
