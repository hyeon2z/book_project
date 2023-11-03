package book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
	private String id;
	private String pass;
	private String name;
	// 장바구니에 넣은 책
	// TODO : 장바구니에 넣은 책을 set으로 구분하니 장바구니에 있는
	// 책들 개별구매가 어려움 -> 넘버링 할 수 없어서.
	// 일단 전체 구매로만 구현
	private Set<Book> books;
	private List<Book> buyBooks;

	private int account;

	public User(String id, String pass, String name) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		books = new HashSet<Book>();
		buyBooks = new ArrayList<Book>();
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void updateBooks(Book book) {
		books.add(book);
	}

	public int getAccount() {
		return account;
	}

	public void buyBook(Book book) {
		buyBooks.add(book);
	}

	public void buyBookAccount(int price) {
		account -= price;
	}

	public void chargingAccount(int money) {
		account += money;
	}

	public boolean isBuyBook() {
		return false;
	}

	public void getBuyBook() {
		if (buyBooks.size() > 0) {
			System.out.println("총 " + buyBooks.size() + "권 구매했습니다.");
			System.out.println("--------------------------");
			for (Book book : buyBooks) {
				System.out.println(book.getBookTitle());
			}
			System.out.println();
		} else {
			System.out.println("구매한 책이 없습니다.");
		}
	}

}
