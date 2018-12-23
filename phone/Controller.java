package phone;

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CellPhone phone1 = null;
		while (true) {
			switch(JOptionPane.showInputDialog("[메뉴]\n"
					+ "1.집전화기\n"
					+ "2.휴대폰\n"
					+ "3.아이폰\n"
					+ "4.안드로이드")) {
			case "0" : JOptionPane.showMessageDialog(null,"정지...");return;
			case "1" :
				phone = new PhoneBean();
				phone.setKind((JOptionPane.showInputDialog("종류를 입력하세요")));
				phone.setCompany((JOptionPane.showInputDialog("회사를 입력하세요")));
				phone.setCall((JOptionPane.showInputDialog("전화내용를 입력하세요")));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case "2" :
				phone1 = new CellPhone();
				phone1.setKind((JOptionPane.showInputDialog("종류를 입력하세요")));
				phone1.setCompany((JOptionPane.showInputDialog("회사를 입력하세요")));
				phone1.setCall((JOptionPane.showInputDialog("전화내용를 입력하세요")));
				phone1.setMove(JOptionPane.showInputDialog("이동가능성?"));
				JOptionPane.showMessageDialog(null,phone1.toString());
				break;
			}
		}
	}
}
