package myPage;

public class UserInfo { // 회원가입한 유저의 정보
	private String name = "이송현";
	private String nickName = "song243";
	private String email = "song243@gmail.com";
	private String address = "서울 강남구 123-45";
	private String phoneNumber = "010-9876-5432";
	private String userInfoExpirDate = "1년";
	private String accountLinkedStatus = "구글연동";
	
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
		return userInfoExpirDate;
	}
	public void setUserInfoExpirDate(String userInfoExpirDate) {
		this.userInfoExpirDate = userInfoExpirDate;
	}
	public String getAccountLinkedStatus() {
		return accountLinkedStatus;
	}
	public void setAccountLinkedStatus(String accountLinkedStatus) {
		this.accountLinkedStatus = accountLinkedStatus;
	}
	
}
