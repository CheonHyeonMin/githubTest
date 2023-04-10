package 성적관리프로그램;

public class Student {
//필드
	private String name;
	private String number;
	private int javaScore;
	private int dbScore;
	private int webScore;
	
	
	//생성자
	//객체를 생성할떄 최초로 1번만 호출되는 메소드
	//반환타입 작성 x -> void도 x
	//( 없는 경우 컴파일시에 자동으로 default 생성자 추가)
	public Student(String name, String number, int javaScore, int webScore, int dbScore) {
		this.name= name;
		this.number=number;
		this.javaScore = validScore(javaScore);
		this.javaScore = validScore(dbScore);
		this.javaScore = validScore(webScore);
		
	}
	//어차피 이 메소드는 내부에서 쓰기 때문에 접근제한자를 private로 하는게 좋음
	private int validScore(int score) {
		if(score>=0 || score<=100) {
			return score;
		}
		else {
			return 0;
		}
	}
	// getter 메소드 값 불러오기
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public int getDbScore() {
		return dbScore;
	}
	public int getWebScore() {
		return webScore;
	}
	
	// setter 메소드 값 지정해주기
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	public void setDbScore(int dbScore) {
		this.dbScore = dbScore;
	}
	public void setWebScore(int webScore) {
		this.webScore = webScore;
	}
	
}
