package vo;

import java.util.Scanner;

public class MyInfo {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String loc;
	private String account;

	public MyInfo() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		String name = sc.nextLine();
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void sell() {
		while (true) {
			System.out.println("판매를 진행하시겠습니까?\n(1.예 2.아니요)");
			String ans = sc.nextLine();
			if (ans.equals("2")) {
				break;
			} else {
				System.out.println("=============");
				System.out.println("정보입력을 시작합니다. ");
				System.out.println("=============");
				System.out.println("이름을 입력해주세요.");
				name = sc.nextLine();
				
				System.out.println("주소를 입력해주세요.");
				loc = sc.nextLine();
			
				System.out.println("환불처리시, 환불받을 계좌를\n 입력해주세요.");
				account = sc.nextLine();
				
				break;
			}
		}
	}

	public void sellInfo() {
		System.out.println("=============");
		System.out.println("정보를 확인합니다.");
		System.out.println("이름\n------------" + name);
		System.out.println("주소\n------------" + loc);
		System.out.println("계좌번호\n------------" + account);
		System.out.println("=============");
	}

}
