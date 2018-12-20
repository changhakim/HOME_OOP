package gaza;

import java.util.Random;

public class Lotto {
	public String lotto() {
	Random random = new Random();	
		String res = "";
		int[] a = new int[6];
		for(int i =0;i<a.length;i++) {
			a[i] = random.nextInt(45);
		res += a[i]+",";
		}
		
		
		return res;
	}
}
