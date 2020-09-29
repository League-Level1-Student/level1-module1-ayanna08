package _06_duck;

public class Unicorn {

	Unicorn(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	int numberOfFriends;
	String favoriteFood;
	
	void walk() {
		System.out.println("walk");
	}
	
	void neigh() {
		System.out.println("neigh");
	}
}
