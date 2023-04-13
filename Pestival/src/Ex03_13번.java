
public class Ex03_13번 {

	public static void main(String[] args) {
		String score="A,A,B,C,D,A,C,D,D,D,F";
		String a[] = score.split(",");
		String b[] = {"A","B","C","D","F"};
		int c[] = new int[a.length];

		for(int i=0;i<b.length;i++) {
			int temp=0;
			for(int j=0; j<a.length;j++) {
				if(b[i].equals(a[j])) {
					c[i]=temp++;
				}
			}
			System.out.println(b[i] + ":"+ temp);
		}
		

	}

}
