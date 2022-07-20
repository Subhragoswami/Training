package day4;

interface  Drivable{
	void start();
	void accelerate();
	void stop();
}
class car implements Drivable{
	public void start() {
		System.out.println("car starts");
	}
	public void accelerate() {
		System.out.println("car accelerate");
	}
	public void stop() {
		System.out.println("car stopped");
	}
}
class Bus implements Drivable{
	public void start() {
		System.out.println("Bus starts");
	}
	public void accelerate() {
		System.out.println("Bus accelerate");
	}
	public void stop() {
		System.out.println("Bus stopped");
	}
}

public class InterfaceExample {
    public static void main(String[] args) {
    	car c=new car();
    	Bus b=new Bus();
    	c.accelerate();
    	b.accelerate();
	}
    public void m(){
    	System.out.println("hi");
    }
}
