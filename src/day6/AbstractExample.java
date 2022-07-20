package day6;

public class AbstractExample {
	public static void main(String[] args) {
		Nokia n=new Nokia();
		n.call();
		n.message();
		Oneplus o=new Oneplus();
		o.call();
		o.message();
		o.camera();
	}
}
abstract class Mobile{
	abstract void call();
	abstract void message();
	void camera() {
		System.out.println("clicking photos");
	}
}
class Nokia extends Mobile{
	void call() {
		System.out.println("calling from nokia");
	}
	void message() {
		System.out.println("messaging from nokia");
	}
}
class Oneplus extends Mobile{
	void call() {
		System.out.println("calling from Oneplus");
	}
	void message() {
		System.out.println("messaging from oneplus");
	}
	void camera() {
		System.out.println("clicking photos from oneplus");
			}
}

