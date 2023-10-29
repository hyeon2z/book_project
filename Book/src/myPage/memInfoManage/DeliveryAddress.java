package myPage.memInfoManage;

import java.util.Scanner;

import myPage.UserInfo;

public class DeliveryAddress extends UserInfo{ // 기본 배송지 외 배송주소록 추가

	public void deliveryAddressAdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("배송 주소록 관리");
		while(true) {
			System.out.println("\n=====배송지 목록=====");
			int cnt = 1;
			for(String addresslist : getAddressList()) {
				System.out.print(cnt + ") " +addresslist);
				if(cnt == 1) {
					System.out.print("(기본주소)");
				}
				System.out.println();
				cnt++;
			}
			try{
				System.out.print("새 주소를 추가하려면 1을, 수정/삭제를 하려면 2를 입력하세요(0입력 시 종료) : ");
				int userNum = Integer.parseInt(sc.nextLine());
				switch(userNum) { // 선택한 주소 1~xx ==> 수정/삭제 하려면 1,2 입력 (기본배송지는 삭제 안뜨게 처리)
					case 0: // 종료
						System.out.println("배송 주소록 관리 종료");
						break;
					case 1: // 새 주소 추가
						System.out.print("\n추가할 주소를 입력하세요 : ");
						String addAddress = sc.nextLine();
						addressList.add(addAddress);
						continue;
					case 2: // 수정/삭제
						while(true) {
							try {
								System.out.println("\n=====배송지 목록=====");
								cnt = 1;
								for(String addresslist : getAddressList()) {
									System.out.print(cnt + ") " +addresslist);
									if(cnt == 1) {
										System.out.print("(기본주소)");
									}
									System.out.println();
									cnt++;
								}
								System.out.print("수정/삭제를 희망하는 주소를 입력하세요(0입력 시 종료) : ");
								int userChoice = Integer.parseInt(sc.nextLine())-1;
								
								switch(userChoice) { // 선택한 주소 1~xx ==> 수정/삭제 하려면 1,2 입력 (기본배송지는 삭제 안뜨게 처리)
									case -1: // 종료
										System.out.println("주소록 수정/삭제 종료");
										break;
									case 0: // 여긴 수정만
										while(true) {
											System.out.println("\n선택한 주소 : " + addressList.get(userChoice));
											System.out.print("수정할 주소를 입력하세요(기본주소는 삭제가 안됩니다) : ");
											String userAddress = sc.nextLine();
											System.out.println("\n입력한 주소 : " + userAddress);
											try {
												System.out.print("수정하려면 1, 다시입력하려면 2, 이전으로 가시려면 0 을 입력하세요 : ");
												int userAccess = Integer.parseInt(sc.nextLine());
												switch(userAccess) {
													case 1:
														System.out.println("수정완료 되었습니다.");
														addressList.set(userChoice, userAddress);
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
											}catch(NumberFormatException ne) {
												System.out.println("올바르지 않은 입력입니다.");	
												continue;
											}
											break;
										}
										continue;
									default: // 입력값 대로 수정/삭제 가능하게
										while(true) {
											System.out.println("\n선택한 주소 : " + addressList.get(userChoice));
											try {
												System.out.print("수정하려면 1, 삭제하려면 2, 이전으로 가시려면 0 을 입력하세요 : ");
												int userAccess = Integer.parseInt(sc.nextLine());
												switch(userAccess) {
													case 1: // 수정
														while(true) {
															System.out.println("선택한 주소 : " + addressList.get(userChoice));
															System.out.print("수정할 주소를 입력하세요 : ");
															String userAddress = sc.nextLine();
															System.out.println("\n입력한 주소 : " + userAddress);
															try {
																System.out.print("수정하려면 1, 다시입력하려면 2, 이전으로 가시려면 0 을 입력하세요 : ");
																int userAccess2 = Integer.parseInt(sc.nextLine());
																switch(userAccess2) {
																	case 1:
																		System.out.println("수정완료 되었습니다.");
																		addressList.set(userChoice, userAddress);
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
															}catch(NumberFormatException ne) {
																System.out.println("올바르지 않은 입력입니다.");	
																continue;
															}
															break;
														}
														break;
													case 2: // 삭제
														addressList.remove(userChoice);
														System.out.println("삭제되었습니다.");
														break;
													case 0: // 이전으로
														System.out.println("이전화면으로 돌아갑니다");
														break; // 변경없이 반복문 탈출
													default: // 잘못된입력
														System.out.println("올바르지 않은 숫자입니다.");
														continue;
												}
												
											}catch(NumberFormatException ne) {
												System.out.println("올바르지 않은 입력입니다.");	
											}
											break;
										}
										continue;
								}
							}catch(NumberFormatException ne) {
								System.out.println("올바르지 않은 입력입니다.");
								continue;
							}catch(ArrayIndexOutOfBoundsException ae) {
								System.out.println("올바르지 않은 입력입니다.");
							}
							break;
						}
						continue;
					default :
						System.out.println("올바르지 않은 숫자입니다.");
						continue;
				}
			}catch(NumberFormatException nf) {
				System.out.println("올바르지 않은 입력입니다.");
			}
			break;
		}
	}
}
