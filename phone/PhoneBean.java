package phone;

public class PhoneBean {
	private String kind,company,call;
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getCall() {
		return call;
	}
	public String toString() {
		return String.format("종류:%s\n"
				+ "회사:%s\n"
				+ "전화내용:%s\n",kind,company,call);
	}
}
