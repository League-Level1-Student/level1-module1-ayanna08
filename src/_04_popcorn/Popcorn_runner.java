package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_runner {
	public static void main(String[] args) {
		
		String flavor = JOptionPane.showInputDialog("What flavor do you want the popcorn?");
		Popcorn pop = new Popcorn(flavor);
		Microwave micro = new Microwave();
		micro.putInMicrowave(pop);
		String time1 = JOptionPane.showInputDialog("How long to you want the popcorn cooked?");
		int time = Integer.parseInt(time1);
		micro.setTime(time);
		micro.startMicrowave();
	}
}
