package myPage;

import java.util.ArrayList;
import java.util.Scanner;

import myPage.memInfoManage.DeliveryAddress;
import myPage.memInfoManage.EditUserInfo;

public class MyPageMain { // 마이페이지

	public static void main(String[] args) {
		ArrayList<String> myPageIndex = new ArrayList<String>();
		myPageIndex.add("개인정보 수정");
		myPageIndex.add("배송주소록");
		EditUserInfo info = new EditUserInfo();
		DeliveryAddress da = new DeliveryAddress();
		
		while(true) {
			System.out.println("마이페이지 목차");
			int cnt = 1;
			for(String printIndex : myPageIndex) {
				System.out.println(cnt + ") " + printIndex);
				cnt++;
			}
			Scanner sc = new Scanner(System.in);	
			System.out.print("\n이동할 목차를 선택하세요(0입력 시 종료) : ");
			try {
				int userChoice = Integer.parseInt(sc.nextLine())-1;
				switch(userChoice) {
					case -1:
						System.out.println("마이페이지 종료.");
						break;
					case 0:
						System.out.println("\n개인정보 수정 페이지 출력\n");
						info.userInfoChange();
						continue;
					case 1:
						System.out.println("\n배송주소록 페이지 출력\n");
						da.deliveryAddressAdd();
						continue;
					default:
						System.out.println("올바르지 않은 숫자입니다.\n");
						continue;
				}
			}catch(NumberFormatException ne) {
				System.out.println("올바르지 않은 입력입니다.\n");
				continue;
			}
			break;
		}
	}

}

