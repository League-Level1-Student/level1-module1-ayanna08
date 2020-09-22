package _05_vault;

public class Spy {
	private String name; 
	Spy(String name){
		this.name = name;
	}
	int findCode(Vault bank) {
		for(int i = 1; i < 1001; i++) {
			if(bank.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
