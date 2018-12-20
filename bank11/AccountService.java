package bank11;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
public class AccountService {

	public String accountNum() {
		String accountNum = "";
		Random random = new Random();
		int[] a = new int[12];
		for(int i=0;i<a.length;i++) {
			a[i] = random.nextInt(10);
			if(i==2||i==5) {
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
	public int deposit(int money,int aa) {
		
		
		if(aa>0) {
			money +=aa;
			
		}else {
			
		}
		return money;
		
	}
	public int withDraw(int money,int bb) {
		if(bb<=money && bb>0) {
			money -= bb;
		
		}
		return money;
	}
	
	public String info(String name,String accountNum,String today,int money) {
		return String.format("이름:%s\n"
							+ "계좌:%s%s\n"
							+ "생성일자:%s\n"
							+ "잔액:%d",name,AccountBean.NAME_BANK,accountNum,today,money);
	}
}
