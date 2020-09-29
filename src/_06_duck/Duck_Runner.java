package _06_duck;

public class Duck_Runner {
public static void main(String[] args) {
	
	Duck daffy = new Duck("pizza",15);
	Unicorn magic = new Unicorn("icecream",25);
	
	daffy.quack();
	daffy.waddle();
	magic.neigh();
	magic.walk();
}
}
