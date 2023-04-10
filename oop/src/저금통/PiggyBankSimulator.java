package 저금통;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		PiggyBank pig = new PiggyBank(20000);
		Scanner sc = new Scanner(System.in);
		System.out.print("입금할 금액 입력 :");
		int inputMoney = sc.nextInt();
		pig.deposit(inputMoney);
		System.out.println("입금할 금액 입력 :");
		int inputMoney2 = sc.nextInt();
		pig.deposit(inputMoney2);
		pig.getMoney();
		
		/*
		for(int i=0; i<2; i++) {
			pig.deposit();
		}
		pig.showMoney();
		pig.withdraw();
		pig.showMoney();
		*/
		pig.withdraw(300);
		int m=pig.showMoney();
		System.out.println(m + "남았습니다.");

	}

}
