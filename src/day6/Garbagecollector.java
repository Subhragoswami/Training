package day6;

public class Garbagecollector {
	public static void main(String[]args){
		Cricketer c=new Cricketer();
		c=null;
		Cricketer c1=new Cricketer();
		Cricketer c2=new Cricketer();
		System.gc();
	}
}
class Cricketer {
	Cricketer(){
	    System.out.println("playing cricket");
	    }
	protected void finalize() {
	    	System.out.println("listening music");
	    }
	}
