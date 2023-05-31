package arrayListTask.user;

public class User {
//	이름, 아이디, 비밀번호, 핸드폰번호
	private String name;
	private String id;
	private String password;
	private String phoneNum;
	
//	기본 생성자
	public User() {;}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


// String 재정의
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phoneNum + "]";
	}
}
