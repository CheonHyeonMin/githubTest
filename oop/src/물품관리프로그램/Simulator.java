package 물품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//product자료형을 관리하는 ArrayList만들기
		ArrayList<Product> arrp= new ArrayList<Product>();
		int temp=0;
		
		while(true) {
			System.out.print("[1]물건추가 [2]예상 판매량 조회 [3]종료 >>");
			int a = sc.nextInt();
			if(a==3) {
				break;
			}
			
			switch(a) {
			case 1:
				System.out.print("물건 이름");
				String proname = sc.next();
				System.out.print("단가");
				int price = sc.nextInt();
				System.out.print("수량");
				int su=sc.nextInt();
				//product(설계도, 자료형)
				//1.사용자한테 입력받은 name,price,amount를 Product자료형으로 묶자
				//Product p = new Product(name, price, amount);
				//2.ps.add(p);
				
				arrp.add(new Product(proname,price,su));
				break;
				
			case 2:
				//ps안에 있는 데이터들을 다 확인(출력)
				//판매 시 전체 매출
				System.out.println("제품평  단가  /수량");
				
				for(int i=0; i<arrp.size(); i++) {
					System.out.println( arrp.get(i).getName() +"     "  + arrp.get(i).getAmount() + "    " +arrp.get(i).getUnitPrice());
					temp+=(arrp.get(i).getAmount()*arrp.get(i).getUnitPrice());
				}
				System.out.println("판매 시 매출 : " +temp+"원");
				
				break;
			case 3:
				System.out.println("종료");
				break;
			}
			
		}
	}

}
