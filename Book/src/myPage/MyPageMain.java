package myPage;

import myPage.memInfoManage.DeliveryAddress;
import myPage.memInfoManage.EditUserInfo;

public class MyPageMain {

	public static void main(String[] args) {
		EditUserInfo info = new EditUserInfo();
//		info.userInfoChange();
		DeliveryAddress da = new DeliveryAddress();
		da.deliveryAddressAdd();
		
	}

}

