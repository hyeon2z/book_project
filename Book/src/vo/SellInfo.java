package vo;

public class SellInfo { // 판매 정보 저장
	
	private BookInfo bookInfo;
	private MyInfo myinfo;

	public SellInfo(BookInfo bookInfo, MyInfo myinfo) {
		this.bookInfo = bookInfo;
		this.myinfo = myinfo;
	}
	
	public void sellInfo() {
		System.out.println("=============");
		System.out.println("정보를 확인합니다.");
		bookInfo.showBookInfo();
		System.out.println("판매자 정보");
		System.out.println("=============");
		myinfo.sellInfo();
		System.out.println("=============");
	}
}
