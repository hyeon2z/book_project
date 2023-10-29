package myPage.memInfoManage;

import java.util.Scanner;

import myPage.UserInfo;

public class EditUserInfo extends UserInfo{  // 개인정보 수정
	String[] UserInfoDetail = {"이름", "닉네임", "이메일 주소", "주소", "핸드폰 번호", "개인정보 유효기간"};
	
	public void userInfo() {
		String[] UserInfo = {getName(), getNickName(), getEmail(), getAddress(), getPhoneNumber(), getUserInfoExpirDate()};
		
		System.out.println("\n=====회원의 개인정보 출력=====");
		for(int i = 0; i < UserInfo.length; i ++) {
			System.out.print(i+1 + ") " + UserInfoDetail[i] + " : " + UserInfo[i]);
			if(i <= 2) {
				System.out.print(" [변경불가]");
			}
			System.out.println();
		}
		System.out.println("\n");
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
							System.out.print("수정할 주소를 입력하세요 : ");
							String userAddress = sc.nextLine();
							System.out.println("입력한 주소 : " + userAddress);
							try {
								System.out.print("수정하려면 1, 다시입력하려면 2, 이전으로 가시려면 0 을 입력하세요 : ");
								int userAccess = Integer.parseInt(sc.nextLine());
								switch(userAccess) {
									case 1:
										setAddress(userAddress);
										break; // 변경 후 반복문 탈출
									case 2:
										continue; // 변경내용 입력으로 다시 돌아감
									case 0:
										System.out.println("이전화면으로 돌아갑니다");
										break; // 변경없이 반복문 탈출
									default:
										System.out.println("올바르지 않은 숫자입니다.");
										continue;
								}
							}catch(NumberFormatException nf) {
								System.out.println("올바르지 않은 입력입니다.");
								continue;
							}
							break;
						}
						continue;
					case 4:
						while(true) {
							System.out.print("변경할 핸드폰 번호를 입력하세요 : ");
							String userPhoneNumber = sc.nextLine();
							System.out.println("입력한 핸드폰 번호 : " + userPhoneNumber);
							try {
								System.out.print("변경하려면 1, 다시입력하려면 2, 이전으로 가시려면 0 을 입력하세요 : ");
								int userAccess = Integer.parseInt(sc.nextLine());
								switch(userAccess) {
									case 1:
										setPhoneNumber(userPhoneNumber);
										break; // 변경 후 반복문 탈출
									case 2:
										continue; // 변경내용 입력으로 다시 돌아감
									case 0:
										System.out.println("이전화면으로 돌아갑니다");
										break; // 변경없이 반복문 탈출
									default:
										System.out.println("올바르지 않은 숫자입니다.");
										continue;
								}
							}catch(NumberFormatException nf) {
								System.out.println("올바르지 않은 입력입니다.");
								continue;
							}
							break;
						}
						continue;
					case 5:
						while(true) {
							int cnt = 1;
							System.out.println("\n==변경가능한 개인정보 유효기간 목록==");
							for(String ExpirDateList : InfoExpirDate) {
								System.out.print(cnt+ ") " + ExpirDateList + "\t");
								cnt++;
							}
							try {
								System.out.print("변경할 개인정보 유효기간을 입력하세요 : ");
								int userExpirDateNumber = Integer.parseInt(sc.nextLine())-1;
								if(userExpirDateNumber == userInfoExpirDate) {
									System.out.println("이미 설정되어있는 유효기간입니다!");
									continue;
								}
								System.out.println("선택한 개인정보 유효기간 : " + InfoExpirDate[userExpirDateNumber]);
								System.out.print("변경하려면 1, 다시입력하려면 2, 이전으로 가시려면 0 을 입력하세요 : ");
								int userAccess = Integer.parseInt(sc.nextLine());
								switch(userAccess) {
									case 1:
										setUserInfoExpirDate(userExpirDateNumber);
										break; // 변경 후 반복문 탈출
									case 2:
										continue; // 변경내용 입력으로 다시 돌아감
									case 0:
										System.out.println("이전화면으로 돌아갑니다");
										break; // 변경없이 반복문 탈출
									default:
										System.out.println("올바르지 않은 숫자입니다.");
										continue;
								}
							}catch(NumberFormatException nf) {
								System.out.println("올바르지 않은 입력입니다.");
								continue;
							}catch(ArrayIndexOutOfBoundsException ae) {
								System.out.println("올바르지 않은 숫자입니다.");
								continue;
							}
							break;
						}
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


