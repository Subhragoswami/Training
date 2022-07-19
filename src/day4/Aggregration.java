package day4;

public class Aggregration {
public static void main(String[] args) {

	Camera c=new Camera("jpg");
	Phone p=new Phone(c);
	p.clickphoto();
}
}
class Camera{
	String photo;
	Camera(String g){
	this.photo=g;
	}
	void click()
	{
	System.out.println(photo+" ");
	}
}
class Phone{
	Camera c;
	Phone(Camera c){
	this.c=c;
	}
	void clickphoto(){
	c.click();	
	}
}


