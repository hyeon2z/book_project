package book;

// 책 정보
public class Book {
	// 책 기본 정보
	private String title;
	private String writer;
	private int price;
	private int sellingPrice;
	
	// TODO : (+ 책 상세정보 화면)
	
	public Book(String title, String writer, int price, int sellingPrice) {
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.sellingPrice = sellingPrice;
	}
	
	// 책 정보를 출력
	public void getBookInfo() {
		System.out.println("제목\t" + title);
		System.out.println("지은이\t" + writer);
		System.out.println("정가\t" + price + "원");
		System.out.println("판매가\t" + sellingPrice + "원");
	}
	
	public String getBookTitle() {
		return title;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}
	
	
	
}
