package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		ArrayList<Address> ad = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		while(true) {
			
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >>");
			int a= sc.nextInt();
			if(a==5) {
				break;
			}
			switch(a) {
			case 1:
				System.out.print("이름 :");
				String name = sc.next();
				System.out.print("나이 :");
				int age = sc.nextInt();
				System.out.print("전화번호 :");
				String phone=sc.next();
				ad.add(new Address(name, age, phone));
				
				break;
				
			case 2:
				if(ad.isEmpty()) {
					System.out.println("등록된 연락처가 없습니다.");
				}
				else {
					for(int i=0; i<ad.size(); i++) {
					System.out.println(i+"." + ad.get(i).getName() + "(" +ad.get(i).getAge() + ") :" + ad.get(i).getPhoneNumber());
				}
				}
				break;
				
			case 3:
				if(ad.isEmpty()) {
					System.out.println("등록된 연락처가 없습니다.");
				}
				else {
					for(int i=0; i<ad.size(); i++) {
					System.out.println((i+1)+"." + ad.get(i).getName() + "(" +ad.get(i).getAge() + ") :" + ad.get(i).getPhoneNumber());
				}
				}
				int delete=sc.nextInt();
				ad.remove(delete-1);
				break;
				
			case 4:
				System.out.print("검색할 이름 입력 :");
				String search= sc.next();
				for(int i=0; i<ad.size(); i++) {
					if(ad.get(i).getName().equals(search)) {
					System.out.println(i+"." + ad.get(i).getName() + "(" +ad.get(i).getAge() + ") :" + ad.get(i).getPhoneNumber());
				}
				}
				break;
			case 5:
				System.out.println("종료");
				break;
			}
		}
	}

}
