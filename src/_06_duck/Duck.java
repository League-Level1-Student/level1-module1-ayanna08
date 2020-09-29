package _06_duck;

public class Duck {

	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	int numberOfFriends;
	String favoriteFood;
	
	void quack() {
		System.out.println("quack");
	}
	
	void waddle() {
		System.out.println("waddle");
	}
	
}
