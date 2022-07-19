package day4;

public class SingleInheritence {
public static void main(String[] args) {
	Watch w=new Smartwatch();
	w.display();
	Smartwatch s=new Smartwatch();
	s.show();
}
}
class Watch{
	void display() {
	System.out.println("show time");
}
}
class Smartwatch extends Watch
{
	void show() {
	super.display();
	System.out.println("show heartrate");
}
}
