package day3;
import java.util.Scanner;
public class Dowhile {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter NO:");
		int num=scn.nextInt();
		int count=0;
		do
		{
		num=num/10;
		count++;
		}while(num>0);
		System.out.println("Length of the No is "+count);
}
}

