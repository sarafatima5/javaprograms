package simple_threads;

public class mainthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		namethread name = new namethread(); 
		calcthread si = new calcthread();
		name.start(); 
		si.start();

	}

}
