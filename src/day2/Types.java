package day2;
import java.util.Scanner;
public class Types {
	
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter Amount");
	    int amount=scn.nextInt();
	    System.out.println("Enter bank Interest");
	    int Interest=scn.nextInt();
	    System.out.println("Enter for how many years the amount  will be in bank:");
	    int Time=scn.nextInt();
	    System.out.println("enter customer name:");
	    String st=scn.next();
	    int Total=((amount*(100+Interest))/100)*Time;   
	    System.out.println(st+" will get the amount of "+Total);
		
		System.out.println("enter two nnubers.");
		int FirstNum=scn.nextInt();
		int SecondNum=scn.nextInt();
		
	
		int num=FirstNum<SecondNum? FirstNum:SecondNum;
		while(true){
			if (FirstNum%num==0 && SecondNum%num==0) break;
			num--;
		}
		System.out.println("GCD of "+FirstNum+" and "+SecondNum+" = "+num);
		System.out.println("enter two nymbers");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		int result=0;
		result=num1&num2;
		System.out.println("num1&num2="+result);
		
		result=num1|num2;
		System.out.println("num1|num1="+result);
		
		result=num1^num2;
		System.out.println("num1^num2="+result);
		 
		result=num1>>2;
		System.out.println("num1>>2="+result);
		
		result=num2<<2;
		System.out.println("num2<<2="+result);
		
	}
   }


