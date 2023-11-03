package service;

import java.util.Set;

import book.Book;
import book.User;

public class BookDetailService {
	
	// 책 상세정보 확인 페이지
	public void getBookDetail(Book book) {
		System.out.println("\n---------------");
		book.getBookInfo();
		System.out.println("---------------\n");

	}
	
	// 장바구니 담기
	public boolean isBasket(User user, Book book) {
		if (user.getBooks().contains(book)) {
			return false;
		} else {
			return true;
		}		
	}
	
	public void buyBook(User user, Book book) {
		System.out.println("금액 : " + book.getSellingPrice());
		if (user.getAccount() < book.getSellingPrice()) {
			System.out.println("금액이 부족합니다. 충전 후 다시 이용해주세요.");
		} else {
			System.out.println("결제 완료되었습니다.");
			user.buyBookAccount(book.getSellingPrice());
			user.buyBook(book);
			System.out.println("남은 잔액 : " + user.getAccount());
		}
	}
	
	public void buyBooks(User user, Set<Book> books, int totalPrice) {
		// 여러 책 구매 
		System.out.println("금액 : " + totalPrice);
		if (user.getAccount() < totalPrice) {
			System.out.println("금액이 부족합니다. 충전 후 다시 이용해주세요.");
		} else {
			System.out.println("결제 완료되었습니다.");
			user.buyBookAccount(totalPrice);
			for (Book book : books) {
				user.buyBook(book);
			}
			System.out.println("남은 잔액 : " + user.getAccount());
		}
	}
	
	public void boughtBook(User user) {
		System.out.println("======= 구매한 책 =======");
		user.getBuyBook();
	}

}
