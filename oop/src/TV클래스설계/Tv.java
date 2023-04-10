package TV클래스설계;
// class : 객체의 속성과 행동을 정의하는 설계도
public class Tv {
// 필드
	String brand = "";
	double 크기 = 0;
	int 가격 = 0;
	boolean smart;
	boolean sw;
	int 채널;
	int 볼륨;
	
	
	
// 메소드
	public void 전원켜기() {
		sw = true;
	}
	public void 전원끄기() {
		sw = false;
	}
	public void 채널올리기() {
		채널++;
	}
	public void 채널내리기() {
		채널--;
	}
	public void 채널변경하기(int 변경할채널번호) {
		채널= 변경할채널번호;
	}
	public void 볼륨올리기() {
		볼륨++;
	}
	public void 볼륨내리기() {
		볼륨--;
	}
}
