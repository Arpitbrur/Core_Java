package Multithreading;

class demo extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
}

public class run {
     public static void main(String[] args) {
	  demo d = new demo();
	  demo d1 = new demo();
	  demo d2 = new demo();
	  demo d3 = new demo();
	  
	  d.start();
	  d1.start();
	  d2.start();
	  d3.start();
}
}
