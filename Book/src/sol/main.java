package sol;


import java.util.Scanner;

import vo.BookInfo;
import vo.MyInfo;
import vo.SellList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 로그인 연결하기
		while (true) {
			System.out.println("중고판매로 이동하시겠습니까?\n(1.예 2.아니요)");
			String ans = sc.nextLine();
			if (ans.equals("2")) {
				break;
			} else {

				BookInfo b01 = new BookInfo();
				b01.regBook();
				b01.showBookInfo();

				
				System.out.println("장바구니에 저장 : 1, 아니오 : 2");
				String ans1 = sc.nextLine();
		        if (ans1.equals("1")) {
		            System.out.println("장바구니로 이동합니다.");
		            SellList s01 = new SellList(b01);
		            s01.showBookInfo();
		        } else {
		            System.out.println("저장을 취소하였습니다.");
		            break;
		        }
					MyInfo m01 = new MyInfo();
					m01.sell();
					m01.sellInfo();
					System.out.println("입력하신 정보로 판매하시겠습니까?\n(1.예 2.아니요)");
					String ans03 = sc.nextLine();
					if (ans03.equals("2")) {
			            break;}
					else {
						System.out.println("판매가 완료되었습니다!");
						System.out.println("취소하시겠습니까?\n(1.예 2.아니요)");
						String ans04 = sc.nextLine();
						if(ans04.equals("1")) {
							System.out.println("취소되었습니다!");
							break;
						}
					}
				}

			}
		}
	}

// sdd