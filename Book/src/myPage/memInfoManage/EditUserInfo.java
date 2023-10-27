package myPage.memInfoManage;

import java.util.Scanner;

import myPage.UserInfo;

public class EditUserInfo extends UserInfo{  // 개인정보 수정
	String[] UserInfoDetail = {"이름", "닉네임", "이메일 주소", "집 주소", "핸드폰 번호", "개인정보 유효기간", "계정연동 여부"};
	
	public void userInfo() {
		String[] UserInfo = {getName(), getNickName(), getEmail(), getAddress(), getPhoneNumber(), getUserInfoExpirDate(), getAccountLinkedStatus()};
		
		System.out.println("==회원의 개인정보 출력==");
		for(int i = 0; i < UserInfo.length; i ++) {
			System.out.print(i+1 + ") " + UserInfoDetail[i] + " : " + UserInfo[i]);
			if(i <= 2) {
				System.out.print(" [변경불가]");
			}
			System.out.println();
		}
	}
	public void userInfoChange() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try{
				userInfo();
				System.out.print("변경하실 개인정보의 순번을 입력해주세요(0입력 시 종료) : ");
				int userNum = Integer.parseInt(sc.nextLine())-1;
				switch(userNum) {
					case -1:
						System.out.println("회원정보 변경 종료");
						break;
					case 0, 1, 2:
						System.out.println(UserInfoDetail[userNum] + "은 변경이 불가능합니다.");
						continue;
					case 3:
						while(true) {
							System.out.print("변경할 집 주소를 입력하세요 : ");
							String userAddress = sc.nextLine();
							System.out.println("입력한 주소 : " + userAddress);
							try {
								System.out.print("변경하려면 1, 다시입력하려면 2, 이전으로 가시려면 0 을 입력하세요 : ");
								int userAccess = Integer.parseInt(sc.nextLine());
								switch(userAccess) {
									case 1:
										setAddress(userAddress);
										break; // 주소 변경 후 탈출
									case 2:
										continue; // 변경할 집 주소 입력으로 다시 돌아감
									case 0:
										System.out.println("이전화면으로 돌아갑니다");
										break; // 주소변경없이 탈출
								}
							}catch(NumberFormatException nf) {
								System.out.println("올바르지 않은 입력입니다.");
							}
							break;
						}
						continue;
					case 4:
						while(true) {
							System.out.print("변경할 핸드폰 번호를 입력하세요 : ");
							String userPhoneNumber = sc.nextLine();
							System.out.println("입력한 주소 : " + userPhoneNumber);
							try {
								System.out.print("변경하려면 1, 다시입력하려면 2, 이전으로 가시려면 0 을 입력하세요 : ");
								int userAccess = Integer.parseInt(sc.nextLine());
								switch(userAccess) {
									case 1:
										super.setPhoneNumber(userPhoneNumber);
										break; // 주소 변경 후 탈출
									case 2:
										continue; // 변경할 집 주소 입력으로 다시 돌아감
									case 0:
										System.out.println("이전화면으로 돌아갑니다");
										break; // 주소변경없이 탈출
								}
							}catch(NumberFormatException nf) {
								System.out.println("올바르지 않은 입력입니다.");
							}
							break;
						}
						System.out.print("변경할 핸드폰 번호를 입력하세요 : ");
						setPhoneNumber(sc.nextLine());
						continue;
					case 5:
						System.out.print("변경할 개인정보 유효기간을 입력하세요 : ");
						continue;	
					case 6:
						System.out.print("추가로 연동할 계정의 플랫폼을 선택하세요 : ");
						continue;
					default:
						System.out.println("올바르지 않은 숫자입니다.");
						continue;
				}
				break;
			}catch(NumberFormatException nf) {
				System.out.println("올바르지 않은 입력입니다.");
			}
			
		}
	}

}


