package vo;

import java.util.ArrayList;



public class SellBook {
	private ArrayList<Book> books;

	public SellBook() {
		// TODO Auto-generated constructor stub
	}
	public void regBook(Book b) {
		books.add(b);
		System.out.println(b.getName()+"을 검색하셨습니다.");
		
	} 

}
