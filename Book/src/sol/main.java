package sol;

import java.util.Scanner;

import vo.BookInfo;
import vo.MyInfo;
import vo.SellInfo;
import vo.SellList;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 로그인 연결하기
		while (true) {
			System.out.println("중고판매로 이동하시겠습니까?\n(1.예 2.아니요)");
			// 기본 메인페이지에서 중고판매 탭 이동
			String ans = sc.nextLine();
			if (ans.equals("2")) {
				break;
			} else {
				BookInfo b01 = new BookInfo();
				// 책 검색 클래스
				b01.regBook();
				// 책 검색 + 검색한 책 저장
				b01.showBookInfo();
				// 검색한 책 저장후 책 정보 출력
				System.out.println("장바구니에 저장 : 1, 아니오 : 2");
				// 기존에 검색했던 책 장바구니로 저장여부 확인
				String ans1 = sc.nextLine();
				if (ans1.equals("1")) {
					System.out.println("장바구니로 이동합니다.");
					SellList s01 = new SellList(b01);
					// 검색한 책 장바구니로 저장
					s01.showBookInfo();
					// 장바구니 리스트 확인
				} else {
					System.out.println("저장을 취소하였습니다.");
					break;
					// 장바구니에 저장하지 않을 경우 프로그램 종료
				}
				MyInfo m01 = new MyInfo();
				// 판매 신청 정보페이지 개인정보 입력하기 위한 객체 생성
				m01.sell();
				// 판매 정보 입력 메서드 호출
				m01.sellInfo();
				// 입력한 정보 확인 메서드 호출
				System.out.println("입력하신 정보로 판매하시겠습니까?\n(1.예 2.아니요)");
				String ans03 = sc.nextLine();
				// 판매 진행여부 확인
				if (ans03.equals("2")) {
					break;
				} else {
					System.out.println("판매가 완료되었습니다!");
					System.out.println("취소하시겠습니까?\n(1.예 2.아니요)");
					// + 바로 취소 기능 추가(개선방안)
					String ans04 = sc.nextLine();
					if (ans04.equals("1")) {
						System.out.println("취소되었습니다!");
						break;
					}
					else {
						System.out.println("판매정보를 확인하겠습니끼?\n(1.예 2.아니요)");
						String ans05 = sc.nextLine();
						if (ans05.equals("2")) {
							System.out.println("프로그램을 종료합니다.");
							break;
							// 조회하지 않을 경우 바로 프로그램 종료
						}else {
							System.out.println("판매정보를 조회합니다.");
							SellInfo s01 = new SellInfo(b01,m01);
							s01.sellInfo();
							// 판매한 책정보와, 입력한 개인정보 확인 메서드 호출
							break;
							// 시스템 종료
						}
					}
				}
			}

		}
	}
}
