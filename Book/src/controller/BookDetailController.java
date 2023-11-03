package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import book.Book;
import book.User;
import service.BookDetailService;

// 책 상세정보
public class BookDetailController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BookDetailService bookDetailService = new BookDetailService();
		List<Book> books = new ArrayList<Book>();
		User user = new User("test", "1234", "홍길동");
		user.chargingAccount(100000);
		
		books.add(new Book("Java의 정석", "남궁성", 30000, 27000));
		books.add(new Book("혼자 공부하는 자바", "신용권", 24000, 21600));

		while (true) {
			System.out.println("======= 메뉴 =======");
			System.out.println("1 : 구매");
			System.out.println("2 : 장바구니");
			System.out.println("3 : 잔액 충전");
			System.out.println("4 : 구매한 책 확인");
			System.out.println("0 : 종료");
			System.out.println("-------------");
			System.out.print("> ");
			int userNum = Integer.parseInt(scan.nextLine());
			if (userNum == 0) {
				break;
			}
			System.out.println();
			while (userNum == 1) {
				int buyNum;
				System.out.println("======= 구매 =======");
				System.out.println("----- 책 리스트 -----");
				for (int i = 0; i < books.size(); i++) {
					// 책 리스트 출력
					System.out.print(i + 1 + " │ ");
					System.out.println(books.get(i).getBookTitle());
					System.out.println("-----------------");

				}
				System.out.println();
				System.out.print("책 상세보기(뒤로가기 : 0) : ");

				Book userBook;
				try {
					buyNum = Integer.parseInt(scan.nextLine());
					System.out.println("-----------------");
					
					if (buyNum == 0) {
						break;
					}

					// 에러가 없다면 책의 정보를 불러오기
					userBook = books.get(buyNum - 1);
					bookDetailService.getBookDetail(books.get(buyNum - 1));

				} catch (IndexOutOfBoundsException e) {
					// 없는 번호를 입력하였을때
					System.err.println("제대로 된 번호를 입력해주세요.");
					continue;
				} catch (NumberFormatException e) {
					System.err.println("숫자만 입력해주세요.");
					continue;
				}

				System.out.println("------------------");
				System.out.println("1. 장바구니 담기");
				System.out.println("2. 바로 구매");
				System.out.print("> ");
				buyNum = Integer.parseInt(scan.nextLine());
				System.out.println("------------------");

				if (buyNum == 1) {
					// 장바구니 저장
					if (bookDetailService.isBasket(user, userBook)) {
						System.out.println("장바구니에 추가 완료!");
						user.updateBooks(userBook);
					} else {
						System.out.println("이미 장바구니에 있습니다.");
					}
				} else if (buyNum == 2) {
					System.out.println();
					System.out.println("구매 페이지로 이동합니다.");
					System.out.println("-------------------------");
					bookDetailService.buyBook(user, userBook);
					System.out.println();
				}
			}
			if (userNum == 2 && !user.getBooks().isEmpty()) {
				System.out.println("======= 장바구니 =======");
				
				int totalPrice = 0;
				for(Book book : user.getBooks()) {
					System.out.println(book.getBookTitle());
					totalPrice += book.getSellingPrice();
					
				}
				System.out.println("------------");
				System.out.println("총 금액 : " + totalPrice);
				System.out.println("구매하시겠습니까? (예 : 1, 아니오 : 0)");
				System.out.print("> ");
				if (scan.nextLine().equals("1")) {
					bookDetailService.buyBooks(user, user.getBooks(), totalPrice);
				} else {
					System.out.println("메뉴로 돌아갑니다.");
				}
				
			} else if (userNum == 2 && user.getBooks().isEmpty()) {
				System.out.println("장바구니가 비어있습니다. 상품을 추가해주세요.");
			} else if (userNum == 3) {
				System.out.println("======= 잔액 충전 =======");
				System.out.println("현재 잔액 : " + user.getAccount());
				System.out.println("얼마 충전하시겠습니까?");
				System.out.print("> ");
				user.chargingAccount(Integer.parseInt(scan.nextLine()));
				System.out.println("충전 완료. 충전 완료된 잔액 : " + user.getAccount());
			} else if (userNum == 4) {
				bookDetailService.boughtBook(user);
				
			}
			
		}

	}

}
