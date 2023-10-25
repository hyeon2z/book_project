package vo;

import java.util.List;
import java.util.Scanner;

public class SellList extends BookInfo{ // 검색한 책 판매장바구니 이동
	
	private BookInfo bookInfo;
	
	Scanner sc = new Scanner(System.in);
	
	public SellList() {
		bookInfo = new BookInfo();
		bookInfo.showBookInfo();
    }
	
	public void goList() {
        System.out.println("등록하신 책을 판매장바구니에 저장하시겠습니까?\n1.네 / 2. 아니요");
        String ans = sc.nextLine();
        if (ans.equals("1")) {
            System.out.println("장바구니로 이동합니다.");
            bookInfo.showBookInfo();
        } else {
            System.out.println("저장을 취소하였습니다.");
        }
    }

//	@Override
//	public void showBookInfo() {
//		super.showBookInfo();
//	}
	
	
}
	
