package day7;


public class FullOops {
public static void main(String[] args) {
	CompanyA c=new CompanyA();
	c.setpassword(1234);
	int r=c.getpassword();
	System.out.println("password is= "+r);//encapsulation
	Ac a=new CompanyA();
	Ac.ac();//early binding
	a.temperature();//dynamic binding	
}
}
interface Totalarea{
	int area=7000;
	void colour();
	void size();
}
class Ac{
	public static void ac(){
		System.out.println("Voltas");
	}
	void temperature() {
		System.out.println("tempurature range is in between");
	}
	
}
class CompanyA extends Ac  implements Totalarea{//abstraction and inheritence
	private int companyPassword;
	
	public void setpassword(int r){
		companyPassword=r;	
	}
	public int getpassword() {
		return companyPassword;
	}
	public void colour(){
		System.out.println("Colour will be green and white");
	}
	public void size(){
		System.out.println("Company size will be 2000sqft.");
	}
	public static void ac(){
		System.out.println("Samsung AC");
	}
	void temperature() {
		System.out.println("Tempurature range is in between 10 to 35 degree celcious.");
	}
}

