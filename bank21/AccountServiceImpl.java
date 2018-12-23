package bank21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountServiceImpl implements AccountService{

	@Override
	public String accountNum() {
		String accountNum = "";
		
		int[] num = new int[12];
		Random random = new Random();
		for(int i =0 ; i < num.length;i++) {
		
		num[i] = random.nextInt(10);	
		if(i == 2 || i == 5) {
		accountNum += num[i] + "-";
		}else{
		accountNum += num[i];
		}
		
		
	}
		
		return accountNum;
}
	@Override
	public String today() {
		
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:a");
		today = sdf.format(date);
		
		return today;
	}

	
	public AccountBean info(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(accountNum());
		account.setToday(today());
		account.setMoney(money);
		return account;
	}

}
