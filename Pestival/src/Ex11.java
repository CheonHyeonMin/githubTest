import java.util.Random;

public class Ex11 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] a= new int[8];
		for(int i = 0; i<8; i++) {
			a[i]=rd.nextInt(50)+1;
			System.out.print(a[i] + " ");
		}
		
		int max= a[0];
		int min = a[0];
		for(int j=0; j<a.length; j++) {
			if(max<a[j]) {
				max=a[j];
			}
			if(min>a[j]) {
				min=a[j];
			}
		}
		System.out.print("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
