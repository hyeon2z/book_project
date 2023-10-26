package vo;

import java.util.List;
import java.util.Scanner;

public class SellList { // 검색한 책 판매장바구니 이동
	
	private BookInfo bookInfo;
	
	Scanner sc = new Scanner(System.in);
	
	public SellList(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

//	public SellList() {
//		bookInfo = new BookInfo();
//		bookInfo.getBookList();
//    }
	
	public void goList() {
        
    }

//	@Override
//	public void showBookInfo() {
//		super.showBookInfo();
////		System.out.println("=============");
////		System.out.println("판매 장바구니 내역");
////		System.out.println("=============");
//		
////		bookInfo = new BookInfo();
////		bookInfo.regBook();
////		bookInfo.getBookList();
////		System.out.println(bookInfo.getBookList());
//	}
	
	public void showBookInfo() {
		bookInfo.showBookInfo();
	}
	
	
}
	
