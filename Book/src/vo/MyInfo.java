package vo;

import java.util.Scanner;

public class MyInfo { // 판매자 정보 저장
	Scanner sc = new Scanner(System.in);
	private String name;
	private String loc;
	private String account;
	private String phone;

	public MyInfo() {
	}

	public String getName() {
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
				
				System.out.println("핸드폰 번호를 입력하세요.");
				phone = sc.nextLine();

				break;
			}
		}
	}

	public void sellInfo() {
		System.out.println("=============");
		System.out.println("정보를 확인합니다.");
		System.out.println("이름\n------------\n" + name+"\n\n");
		System.out.println("주소\n------------\n" + loc+"\n\n");
		System.out.println("계좌번호\n------------\n" + account+"\n\n");
		System.out.println("핸드폰번호\n------------\n" + phone+"\n\n");
		System.out.println("=============");
	}

}
