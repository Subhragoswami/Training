package day4;

public class Methodoverloading {
public static void main(String[] args) {
	m1();
	m1(5);
	m1(5,20);
	m1("Subhra");
}
static void m1()
{
	System.out.println("blank");	
}
static void m1(int a) {
	System.out.println(a);
}
static void m1(int a,int b)
{
	System.out.println(a+b);
}
static void m1(String s) {
	System.out.println(s);
}
}
