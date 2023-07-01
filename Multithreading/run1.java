package Multithreading;


class demo1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class run1 {
	public static void main(String[] args) {
		  demo1 d = new demo1();
		  demo1 d1 = new demo1();
		  demo1 d2 = new demo1();
		//  d.start();
		  System.out.println(d.getPriority());
		  d1.setPriority(10);
		 // d1.start();
		  System.out.println(d1.getPriority());
		  System.out.println(d2.getPriority());
		  
	
	 }
}
