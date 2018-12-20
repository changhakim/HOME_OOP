package bank11;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		MemberBean member = null;
		AccountBean account = null;
		AccountService service = new AccountService();
		while(true) {

			switch(JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.정지\n"
					+ "1.회원가입\n"
					+ "2.가입정보\n"
					+ "3.비밀번호 변경\n"
					+ "4.계좌생성\n"
					+ "5.계좌확인\n"
					+ "6.입금\n"
					+ "7.출금")) {
			case "0" :JOptionPane.showMessageDialog(null,"정지...");return;
			case "1" :
				
				member = new MemberBean();
				member.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				member.setId(JOptionPane.showInputDialog("아이디를 입력하세요"));
				member.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
				member.setSsn(JOptionPane.showInputDialog("주민번호를 입력하세요"));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null,member.toString());
				break;
			case "3" :
				member.setPass(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
				break;
			case "4" :
				 account = new AccountBean();
				 account.setAccountNum(service.accountNum());
				 account.setToday(service.today());
				 account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금하세요")));
				JOptionPane.showMessageDialog(null,"계좌가 생성되었습니다.");
				break;
			case"5" :
				
				JOptionPane.showMessageDialog(null,service.info(member.getName(), account.getAccountNum(), 
						account.getToday(), account.getMoney()));
				break;
			case "6":
				
				account.setMoney(service.deposit(account.getMoney(), Integer.parseInt(JOptionPane.showInputDialog("입금액을 입력해주세요"))));
				break;
			case "7":
				
			account.setMoney(service.withDraw(account.getMoney(), Integer.parseInt(JOptionPane.showInputDialog("출금액을 입력해주세요"))));
			break;
			
			}
		}
	}
}
