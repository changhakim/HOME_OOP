package phone;

public class CellPhone extends PhoneBean{
	private String move;
	
	
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	public String toString() {
		return String.format("종류:%s"
				+ "회사:%s\n"
				+ "전화내용:%s\n"
				+ "이동:%s",getKind(),getCompany(),getCall(),move);
	}
	
}
