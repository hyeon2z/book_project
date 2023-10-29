package myPage;

import java.util.ArrayList;
import java.util.Arrays;

public class UserInfo { // 회원가입한 유저의 정보 저장
	private String name = "이송현";
	private String nickName = "song243";
	private String email = "song243@gmail.com";
	private String address = "서울 강남구 123-45"; // 기본 저장 주소값
	protected ArrayList<String> addressList = new ArrayList<String>(Arrays.asList(address)); // 배송주소록 여러개
	private String phoneNumber = "010-9876-5432";
	protected String[] InfoExpirDate = {"1년", "2년", "3년"}; // 개인정보 유효기간 배열로저장
	protected int userInfoExpirDate = 0; // 유저의 개인정보 선택 저장

	public ArrayList<String> getAddressList() {
		return addressList;
	}
	public void setAddressList(ArrayList<String> addressList) {
		this.addressList = addressList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserInfoExpirDate() {
		return InfoExpirDate[userInfoExpirDate];
	}
	public void setUserInfoExpirDate(int userInfoExpirDate) {
		this.userInfoExpirDate = userInfoExpirDate;
	}
	public String[] getInfoExpirDate() {
		return InfoExpirDate;
	}
	public void setInfoExpirDate(String[] infoExpirDate) {
		InfoExpirDate = infoExpirDate;
	}
	
}
