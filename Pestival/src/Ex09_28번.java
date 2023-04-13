
public class Ex09_28번 {

	public static void main(String[] args) {
		String str = "01001101";
		String a[] = str.split("");
		int sum=0;
		int mul=1;
		for(int i=a.length-1; i>=0 ; i-- ) {
			if(a[i].equals("1")) {
				sum+=mul;
			}
			
				mul*=2;
			
		}
		System.out.println(str + "(2) =" + sum + "(10)");
		

	}

}
