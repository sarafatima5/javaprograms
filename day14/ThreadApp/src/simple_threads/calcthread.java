package simple_threads;

public class calcthread extends Thread{
	public void run() { 
		double principal= 40000; 
		double rate = 4; 
		double time = 6; 
		double simpleinterest = (principal * rate * time) / 100; 
		System.out.println("Interest: " + simpleinterest); 
		} 

}
