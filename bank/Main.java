package bank;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.정지\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.계좌생성\n"
					+ "4.계좌정보\n"
					+ "5.입금\n"
					+ "6.출금")
					) {
			case "0" : JOptionPane.showMessageDialog(null,"정지...");return;
			case "1" : 
				String name = JOptionPane.showInputDialog("이름을 입력해주세요");
				String id = JOptionPane.showInputDialog("아이디를 입력해주세요");
				String pass = JOptionPane.showInputDialog("비밀번호를 입력해주세요");
				String ssn = JOptionPane.showInputDialog("주민등록번호를 입력해주세요");
			 member = new Member(name, id, pass, ssn);
			 break;
			case "2" :
				JOptionPane.showMessageDialog(null,member.info());
				break;
			case "3":
				 account = new Account(0);
				 JOptionPane.showMessageDialog(null, "계좌가 생성되었습니다.");
				 break;
			case "4":
				JOptionPane.showMessageDialog(null,account.info(member.name));
			break;
			case "5":
				String deposit = JOptionPane.showInputDialog("입금액을 입력하세요");
				JOptionPane.showMessageDialog(null,String.format("%s",account.deposit(Integer.parseInt(deposit))));
			break;
			case "6":
				String withDraw = JOptionPane.showInputDialog("출금액을 입력하세요");
				JOptionPane.showMessageDialog(null,String.format("%s",account.withDraw(Integer.parseInt(withDraw))));
			}
		}
	}
}
