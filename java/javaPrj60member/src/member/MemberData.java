package member;

public class MemberData {

	private String id;
	private String pwd;
	private String nickname;
	
	public MemberData() {}

	public MemberData(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public MemberData(String id, String pwd, String nickname) {
		this.id = id;
		this.pwd = pwd;
		this.nickname = nickname;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "회원 정보 [아이디=" + id + ", 비밀번호=" + pwd + ", 닉네임=" + nickname + "]";
	}
}
