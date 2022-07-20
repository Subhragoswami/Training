package day5;

public class Binding {
	public static void main(String[] args) {
	Office o=new Josh();
	o.m1();
	o.m2();
}
}
class Office{
	static void m1() {
		System.out.println("It's in Bangalore");
	}
	void m2() {
		System.out.println("It's in dubai");
	}
}
class Josh extends Office{
	static void m1() {
		System.out.println("It's in Pune");
	}
	void m2() {
		System.out.println("It's in Texas");
	}
}