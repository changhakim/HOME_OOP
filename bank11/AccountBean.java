package bank11;

public class AccountBean {
	final static String NAME_BANK = "신한은행";
	private String accountNum,today;
	private int money;
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
		
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setToday(String today) {
		this.today = today;
		
	}
	public String getToday() {
		return today;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
}
