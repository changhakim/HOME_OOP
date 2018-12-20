package gaza;

public class Member {
 String name;
	public String bmi(double t,double w){
		
		String res = "";
	
		double bmi = w / (t * t) *10000;
		if(bmi>40.0) {
			res = bmi+"고도비만";
		}else if(bmi>35.0) {
			res = bmi+"중등도 비만";
		}else if(bmi>25.0) {
			res = bmi+"과체중";
		}else if(bmi>18.5) {
			res = bmi+"정상";
		}else {
			res = bmi+"저체중";
		}
		
		
		return res;
	}
	public String grade(int a,int b,int c,int d,int e) {
		String res ="";
		int sum = a+b+c+d+e;
		int avr = (sum/5)/10;
		switch(avr) {
		case 9 : res = "A";break;
		case 8 : res = "B";break;
		case 7 : res = "C";break;
		case 6 : res = "D";break;
		case 5 : res = "E";break;
		default: res = "F";break;
		
		}
		
		
		return res;
	}
	public String numbers(String num) {
		String res ="";
		
		char a = num.charAt(7);
		switch(a) {
		case '1': res = "남";break;
		case '2': res = "여";break;
		case '3': res = "남";break;
		case '4': res = "여";break;
		case '5': res = "외국인";break;
		case '6': res = "외국인";break;
		default : res = "잘못 입력하셨습니다";break;
		}
		return res;
	}
}
