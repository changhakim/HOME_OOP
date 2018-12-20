package gaza;

public class Calc {

	public String plus(int a, int b) {
		String res = "";
		int sum = a + b;

		res = ""+sum;
		return res;
	}

	public String minus(int a, int b) {
		String res = "";
		int sum = a - b;

		res = ""+sum;
		return res;
	}
	public String multi(int a, int b) {
		String res = "";
		int sum = a * b;

		res = ""+sum;
		return res;
	}
	public String divid(int a, int b) {
		String res = "";
		int sum = a / b;

		res = ""+sum;
		return res;
	}
	public String namu(double a, double b) {
		String res = "";
		double sum = a % b;

		res = ""+sum;
		return res;
	}

	public String gugu(String a) {
		String res = "";
		int b = Integer.parseInt(a);
		String[] gu = new String[9];
		for(int i=0;i<gu.length;i++ ) {
			
			gu[i] = b * (i+1)+",";
			res += b+"*"+(i+1)+"="+gu[i];
		}
		
		
		return res;
	}

}
