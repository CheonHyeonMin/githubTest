
public class Ex14 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
		

	}

	public static String getMiddle(String a) {
		String b = "";
		int len= a.length()/2;
		if(a.length()%2==0) {
			b=a.substring(len/2-1, len/2);
			return b;
		}
		else {
			b=a.substring(len/2, len/2+1);
			return b;
		}
	}
}
