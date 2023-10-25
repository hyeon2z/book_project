package sol;

import java.util.Scanner;

import vo.BookInfo;
import vo.SellList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		// 로그인 연결하기
		
		BookInfo b01 = new BookInfo();
	        b01.regBook();
	        b01.showBookInfo();

	        SellList s01 = new SellList();
	        s01.goList();
	        s01.showBookInfo();
	    
	}
}


