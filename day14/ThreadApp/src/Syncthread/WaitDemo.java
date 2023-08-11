package Syncthread;

class Cab 
{ 
	
}

class Cab1 implements Runnable
{
	
	Cab cab;
	String name;
	public Cab1(Cab cab,String name)
	{ 
		this.cab=cab;
		this.name=name;
	}
	public void run() 
	{ 
		synchronized(cab)
		{
			 try
			 { 
				 System.out.println("cabdriver: "+this.name);
				 cab.wait(5000);
				 System.out.println("cab is released by "+this.name);
			 }
			 catch(InterruptedException e)
			 {
				 System.out.println(e);
			 }
		}
	}
}

class Cab2 implements Runnable
{ 
	Cab cab;
	Cab2(Cab cab)
	{ 
		this.cab=cab;
	}
	public void run()
	{
		synchronized(cab)
		{
			try {
				Thread.sleep(2000);
				 cab.notify();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class WaitDemo 
{ 
	 public static void main(String args[])
	 {
		 Cab c1=new Cab();
		 Cab1 cab1=new Cab1(c1,"Peter");
		 Cab2 cab2=new Cab2(c1);
		 Thread t1=new Thread(cab1);
		 Thread t2=new Thread(cab2);
		 t1.start();
		 t2.start();
		 
	 }
}