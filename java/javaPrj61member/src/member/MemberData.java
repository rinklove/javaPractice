package member;

public class MemberData {

	private String id;
	private String pwd;
	private String nickname;
	
	public MemberData(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	public MemberData(String id, String pwd, String nickname) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.nickname = nickname;
	}
	
	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getNickname() {
		return nickname;
	}

	@Override
	public String toString() {
		return "MemberData [id=" + id + ", pwd=" + pwd + ", nickname=" + nickname + "]";
	}

}
