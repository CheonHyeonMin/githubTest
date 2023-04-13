
public class Ex03 {

	public static void main(String[] args) {
		int temp = 0;
		for(int i=1, j=-2; i<100; i+=2,j-=2) {
			temp+=i+j;
		}
		System.out.println(temp);

	}

}
