package _03_harry_potter;

public class HarryPotter_runner {
	public static void main(String[] args) {
		
		HarryPotter potter = new HarryPotter();
		potter.makeInvisible(true);
		potter.spyOnSnape();
		potter.makeInvisible(false);
		potter.castSpell("stupefy");
	}
}
