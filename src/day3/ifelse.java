package day3;
import java.util.Scanner;
public class ifelse {
  public static void main(String[] args) {
	System.out.println("enter password");
	Scanner scn=new Scanner(System.in);
	System.out.println("enter password");
	int pass=scn.nextInt();
	if(pass==1234){
	System.out.println("WELCOME"); 
	}
	else{
		System.out.println("You've entered a wrong password:");
	}
}
}
