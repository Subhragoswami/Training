package day5;

public class Methodoverriding {
	public static void main(String[] args) {
	Snake s=new Snake();
	s.move();
}
}
class Animal{
	void move() {
		System.out.println("moving");
	}
}
class Snake extends Animal{
	@Override
	void move() {
		System.out.println("Crawling");
	}
}