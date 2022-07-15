package day3;
import java.util.Scanner;
public class Switchcase {
   public static void main(String[] args) {
	 Scanner scn=new Scanner(System.in);
	 System.out.println("Enter month");
	 int month=scn.nextInt();
	 int year=scn.nextInt();
	 
	 switch(month)
	 {
	 	case 1:
	 	case 3:
	 	case 5:
	 	case 7:
	 	case 8:
	 	case 10: 
	 	case 12:System.out.println("31 days");break;
	 	case 4:
	 	case 6:
	 	case 9:
	 	case 11:System.out.println("30 days");break;
	 	case 2:if((year%400==0)||(year%5==0 && year %100!=0)){
	 		     System.out.println("29 days");
	 	       }
	 	       else {
	 	    	   System.out.println("28 days");
	 	       }
	 	default:System.out.println("Invalid month");
	 }
}
}
