package _05_vault;

import java.util.Random;

class vault {
	public int r = new Random().nextInt(1000001);
	public	int t ;
	public 	int secretCode = r ;
	boolean trycode(int t) {
		if (t == (secretCode)) {
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
			return false;
		}
	
	}
}
public class safeCrack {
static jamesBond j = new jamesBond();
public static void main(String[] args) {
	

j.crackSafe();
}	
}
class jamesBond {
	vault v = new vault();
	void crackSafe() {
		for (int i = 0; i < 1000001; i++) {
		if( v.trycode(i)==  true) {
			System.out.println(i);
			break;
		}
	
			
		}
	}
	
}

