package vo;

import java.util.List;
import java.util.Scanner;

public class SellList { // 검색한 책 판매장바구니 이동

	private BookInfo bookInfo;

	Scanner sc = new Scanner(System.in);

	public SellList(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

	public void goList() {

	}

	public void showBookInfo() {
		bookInfo.showBookInfo();
	}

}
