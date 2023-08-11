package Syncthread;
class child extends Thread{
	int c=0;
	public void run() {
		while(c!=20) {
		System.out.println(c);
		try {
			sleep(2000);
			c++;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
}
class child2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

public class thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch=new child();
		child2 ch2=new child2();
		ch2.start();
		try {
			ch2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ch.start();
		
	}

}
