package 저금통;

import java.util.Scanner;

public class PiggyBank {
	private int money; 
	// private : 클래스 내부의 메서드를 통해서만 접근 가능
	Scanner sc = new Scanner(System.in);
	int don=0;
	int sum=0;
	public int getMoney() {
		return money;
	}
	//setter --> 다른 클래스에서 money에 있는 값을 수정할 수 있도록
	public void setMoney(int money) {
		this.money=money;
		//this : 현재클래스 지칭하는 키워드
		
		//객체를 생성함과 동시에 필드를 초기화 시켜주는 생성자를 하나 생성
		//생성자의 특징!
		// 1) 생성자도 메서드다!
		// 2) 생성자는 이름이 클래스의 이름과 동일하다
		// 3) 리턴타입을 지정하지 않는다.
		// 4) 매개변수로 아무것도 받지 않는 생성자를 기본생성자
		// --> 기본생성자는 생략(클래스만들때 이미 생략되어있음)
		// --> 내가 새로운 생성자를 하나 만들어버리면 기본 생성자는 기능을 잃는다.
		
	}
	public PiggyBank() {
		//기본 생성자도 사용하고 싶으면 하나 만들어준다.(오버로딩)
		// 오버로딩 : 같은 클래스 내에서 동일한 이름으로 메서드
		//매개변수 형태가 달라야 한다. 
	}
	public PiggyBank(int money) {
		//main에서 보내준 20000값을 현재 필드에 저장
		this.money=money;
	}
	/*
	public void deposit() {//돈넣기
			don=sc.nextInt();
			sum+=don;
	}
	public void withdraw() {//돈인출
		sum -=sc.nextInt();
//		sum-=don;
		
	}
	public void showMoney() {//잔액 보여주기
		System.out.print("현재 잔액:"+sum);
	}
	*/
	
	public void deposit(int inputMoney) {
		money +=inputMoney;
	}
	public void withdraw(int outputMoney) {
		money-=outputMoney;
	}
	public int showMoney() {
		return money;
	}

}
