package _05_vault;

import javax.swing.JOptionPane;

public class Vault_runner {
	public static void main(String[] args) {
		Vault val = new Vault();
		Spy pie = new Spy("James Bond");
		int result = pie.findCode(val);
		if(result == -1) {
			JOptionPane.showMessageDialog(null, "James Bond failed to open the volt");
		}
		else {
			JOptionPane.showMessageDialog(null, "The code to the vault is "+ result);
		}
	}
}
  