package day15;

import java.io.*;


public class CallRecords {
	public void saveCustomer(CallQualityserialization customer)
	{
		 try {
		FileOutputStream fileout=new FileOutputStream(customer.getCustomerName()+".dat");
		 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
		 objectout.writeObject(customer);
		 objectout.flush();
		 objectout.close();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 catch(IOException e1)
		 {
			 System.out.println(e1);
		 }
	}
	public void displayCustomer(String name)
	{
		
		try {
			FileInputStream filein =new FileInputStream(name+".dat");
			ObjectInputStream objectin=new ObjectInputStream(filein);
			CallQualityserialization customer =(CallQualityserialization)objectin.readObject();
			
			
			System.out.println("Call Id "+customer.getCallId());
			System.out.println("Call duration "+customer.getCallDuration());
			System.out.println("Call Quality Grade "+customer.getCallQualityGrade());
			System.out.println("Customer Name "+customer.getCustomerName());
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallQualityserialization obj1=new CallQualityserialization(1,30,"High","Peter");

		CallRecords records=new CallRecords();

		records.saveCustomer(obj1);
		records.displayCustomer(obj1.getCustomerName());

	}

}
