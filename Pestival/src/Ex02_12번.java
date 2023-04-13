import java.util.Scanner;

public class Ex02_12번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int str[][] = new int[a][a];
		int temp=1;
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
					str[j][i]=temp++;
			}
			
		}
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str.length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
