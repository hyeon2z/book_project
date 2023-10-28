package vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookInfo { // 책 검색, 정보저장

	Scanner sc = new Scanner(System.in);

	private List<String> bookList;
	private String name;

	public void regBook() {
		bookList = new ArrayList<String>();
		while (true) {
			System.out.println("책 이름을 입력하세요: ");
			String name = sc.nextLine();
			bookList.add(name);
			System.out.println("더 입력하시려면 '1' 을 입력해주세요('2' 입력시 종료)");
			String ans = sc.nextLine();
			if (ans.equals("2")) {
				System.out.println("입력이 종료되었습니다.");
				break;
			}
		}
	}

	public void showBookInfo() {
		System.out.println("=============");
		System.out.println("책정보출력");
		for (String blist : bookList) {
			System.out.println(blist);
		}
		System.out.println("=============");

	}

	public List<String> getBookList() {
		return bookList;
	}

}
