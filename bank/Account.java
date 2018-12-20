package bank;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Account {
	final static String NAME_BANK = "부자은행";
	String accountNum,today;
	int money;
	Account(int money){
		this.accountNum = accountNum();
		this.money = money;
		this.today = today();
	}
	public String accountNum() {
		String accountNum = "";
		int[] a = new int[12];
		Random random = new Random();
		for(int i =0;i<a.length;i++) {
		a[i] = random.nextInt(10);
		if(i==2 || i==5) {
			accountNum += a[i]+"-"; 
		}else {
			accountNum += a[i];
		}	
		}
		
		return accountNum;
	}
	
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:a");
		today = sdf.format(date);
		return today;
	}
	public String deposit(int money) {
		String deposit = "";
		if(money > 0) {
			this.money += money;	
			deposit = "입금되었습니다.";
		}else {
			deposit = "감옥갈래?";
		}
		
		
		
		return String.format("%s===잔액:%s",deposit,this.money);
	}
	public String withDraw(int money) {
		String withDraw = "";
		if(this.money >= money && money>0) {
			this.money -= money;
			withDraw = "출금되었습니다.";
		}else {
			withDraw = "또이러네";
		}
		
		return String.format("%s===잔액:%s",withDraw,this.money);
	}
	public String info(String name) {
		String info ="";
		
		return String.format("이름:%s\n"
				+ "계좌번호:%s%s\n"
				+ "생성일자:%s\n"
				+ "잔액:%d",name,NAME_BANK,accountNum,today,money);
	}
}
