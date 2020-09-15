package _02_cat;

public class cat_runner {
	public static void main(String[] args) {
		Cat cat = new Cat("Whiskers");
		cat.meow();
		cat.printName();
		
		while(cat.getLives()>0) {
			cat.kill();
		}
	}
}
