package day4;

public class MultilevelInheritance {
	public static void main(String[] args) {
	World w=new Country();
	w.display();
	Country c=new State();
	c.display();
}
}
class World{
	void display() {
	System.out.println("earth");
	}
}
class Country extends World{
	void display() {
	System.out.println("India");
	}
}
class State extends Country{
	void display() {
	System.out.println("West Bengal");
	}
}
