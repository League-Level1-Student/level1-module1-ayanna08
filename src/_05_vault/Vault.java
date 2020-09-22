package _05_vault;

import java.util.Random;

public class Vault {
	private int code;
	Vault(){
		Random randy = new Random();
		code = randy.nextInt(1000)+1;
		
	}
	boolean tryCode(int guess) {
		return (code==guess);
	}
}
