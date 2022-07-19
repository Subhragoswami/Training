package day4;

public class Hierarchicalinheritance {
	public static void main(String[] args) {
	Samsung s=new Samsung();
	s.click();
	Smartphone sm=new Smartphone();
	sm.click();
	sm.show();
}
}
class Sim{
	void click() {
	System.out.println("call");
	}
}
class Smartphone extends Sim{
	void show() {
	System.out.println("click photo");
	}
}
class Samsung extends Sim{
	void display() {
	System.out.println("heartrate");
	}
}
