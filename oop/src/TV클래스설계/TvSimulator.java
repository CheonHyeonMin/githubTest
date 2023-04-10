package TV클래스설계;

public class TvSimulator {

	public static void main(String[] args) {
		//Tv 객체(object) 생성
		//데이터타입 변수명 = 데이터타입();
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		tv1.brand="삼성";
		tv2.brand="LG";
		tv1.채널변경하기(30);
		tv1.채널내리기();
		System.out.println(tv1.채널);
		
	}

}
