package bank21;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean member = null;
		AccountBean account = null;
		AccountService service1 = new AccountServiceImpl();
		MemberService service = new MemberServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.정지"
					+ "1.회원가입"
					+ "2.회원정보"
					+ "3.계좌생성"
					+ "4.계좌 확인")) {
			
			case "0" : JOptionPane.showMessageDialog(null,"정지");return;
			case "1" :
				
			member = service.join(JOptionPane.showInputDialog("이름을 입력하세요"), JOptionPane.showInputDialog("아이디를 입력하세요"), 
						JOptionPane.showInputDialog("비밀번호를 입력하세요"), JOptionPane.showInputDialog("주민번호를 입력하세요"));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null,member.toString());break;
			case "3" : 	
				account = service1.info((Integer.parseInt(JOptionPane.showInputDialog("입금하세요"))));break;
				
				
				
			case "4" : JOptionPane.showMessageDialog(null,account.toString(member.getName()));break;	
		
			}
		}
	}
}
