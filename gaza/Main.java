package gaza;

import javax.swing.JOptionPane;

public class Main {
public static void main(String[] args) {
	
	JOptionPane opt = new JOptionPane();
	
	while(true) {
		
		JOptionPane.showMessageDialog(null,"반갑습니다 회원님");
		String main = JOptionPane.showInputDialog(null,"0.종료\n 1.회원관리\n 2.계산기\n 3.로또\n 4. 달력");
		
		
		switch(main) {
		case "0" : JOptionPane.showMessageDialog(null,"시스템종료");return;
		case "1" : Member m = new Member();
					String name = JOptionPane.showInputDialog(null,"이름을 입력해주세요");
					m.name = name;
					JOptionPane.showMessageDialog(null,String.format("%s 님 환영합니다",m.name));
			String mm = JOptionPane.showInputDialog(null,"[회원관리메뉴]\n 1.BMI\n 2.성적관리\n 3.성별체크");
			switch(mm) {
			case "1": 
				String[] tw = JOptionPane.showInputDialog(null,"키와 몸무게를 입력하세요").split(" ");
				
				
				JOptionPane.showMessageDialog(null,String.format("%s님 bmi지수는 %s",m.name,m.bmi(Double.parseDouble(tw[0]),Double.parseDouble(tw[1]))));
				
				break;
			case "2" : String[] grad = JOptionPane.showInputDialog(null,String.format("%s님의 국어 영어 수학 사회 과학 점수를 입력해주세요",m.name)).split(" ");
					  
			
			JOptionPane.showMessageDialog(null,String.format("%s님의 평점은 %s입니다.",m.name,m.grade(Integer.parseInt(grad[0]),Integer.parseInt(grad[1]),Integer.parseInt(grad[2]),Integer.parseInt(grad[3]),Integer.parseInt(grad[4]))));
			break;
			
			case "3": String num = JOptionPane.showInputDialog(null,"%s님의 주민등록번호를 입력해주세요",m.name);
			JOptionPane.showMessageDialog(null,String.format("%s님의 성별은 %s입니다.",m.name,m.numbers(num)));
			break;
			}
		break;
		case "2": String gesan = JOptionPane.showInputDialog(null,"1.계산기\n2.구구단");
		Calc calc = new Calc();
		switch(gesan) {
			
		case "1":
			
			String[] cal =JOptionPane.showInputDialog(null,"계산기입니다 숫자를 입력해주세요").split(" ");
		
		
		switch(cal[1]) {
		case "+" :
			JOptionPane.showMessageDialog(null,String.format("%s",calc.plus(Integer.parseInt(cal[0]),Integer.parseInt(cal[2]))));
			break;
		case "-" :
			JOptionPane.showMessageDialog(null,String.format("%s",calc.minus(Integer.parseInt(cal[0]),Integer.parseInt(cal[2]))));
			break;
		case "*" :
			JOptionPane.showMessageDialog(null,String.format("%s",calc.multi(Integer.parseInt(cal[0]),Integer.parseInt(cal[2]))));
			break;
		case "/" :
			JOptionPane.showMessageDialog(null,String.format("%s",calc.divid(Integer.parseInt(cal[0]),Integer.parseInt(cal[2]))));
			break;
		case "%" :
			JOptionPane.showMessageDialog(null,String.format("%s",calc.namu(Double.parseDouble(cal[0]),Double.parseDouble(cal[2]))));
			break;
		}
		case "2" : String gugu = JOptionPane.showInputDialog(null,"숫자를 입력해주세요");
		
				JOptionPane.showMessageDialog(null,String.format("%s",calc.gugu(gugu)));
				break;
		
		}
		break;
		case "3" : 
			Lotto lotto = new Lotto();
			
			JOptionPane.showMessageDialog(null,String.format("오늘의 로또 당첨번호는%s",lotto.lotto()));
		
		}
		
	}
}
}
