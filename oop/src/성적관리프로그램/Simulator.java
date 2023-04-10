package 성적관리프로그램;

public class Simulator {

	public static void main(String[] args) {
		//st1 객체 생성 -> 생성자 호출
		 Student st1 = new Student("황해도", "001", 90, 80, 87);
		//st2 객체 생성
		Student st2 = new Student("강예진","002", 100, 150, 100);
		
		System.out.println(st1.getName());
		System.out.println(st1.getNumber());
		System.out.println(st1.getJavaScore());
		
		//st1 학번 수정
		st1.setNumber("002");
		System.out.println(st1.getNumber());
		System.out.println(st2.getDbScore());
		//데이터 보호를 위해 직접 쓰는것은 권장하지 않음
		/*
		st1.name = "황해도";
		st1.number = "001";
		st1.javaSocre = 90;
		st1.dbScore =80;
		st1.webScore = 87;
		*/
		
		
		
	}

}
