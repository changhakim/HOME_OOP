package bank21;

public class AccountBean {
	final static String BANK_Name = "신한은행";
	private String accountNum,today;
	private	int money;
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	public String toString(String name) {
		return String.format("이름%s\n"
				+ "계좌번호:%s%s\n"
				+ "생성날짜:%s\n"
				+ "잔액:%d\n",name,BANK_Name,accountNum,today,money);
	}
}
