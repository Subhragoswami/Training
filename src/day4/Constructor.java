package day4;
import java.util.Scanner;
public class Constructor {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter length and width:-");
	int len=scn.nextInt();
	int wid=scn.nextInt();
	Rectangle r=new Rectangle(len,wid);
	r.display();
}
}
class Rectangle
{
	int length;
	int width;
	
	Rectangle(int length,int width)
	{
	this.length=length;
	this.width=width;
	}
	void display(){
	System.out.println("Area of the rectangle is = "+ length*width);
	}
}

