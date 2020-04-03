package _05_vault;

import java.util.Random;

class vault {
	public int r = new Random().nextInt(1000001);
	public	int t ;
	public	int secretCode = r ;
	void trycode(int t) {
		if (t == (secretCode)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
public class safeCrack {

	
}
class jamesBond {
	vault v = new vault();
	void crackSafe() {
		for (int i = 0; i < 1000001; i++) {
		
			if (i== secretCode) {
				
			}
		}
	}
	
}

