package day15;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Feedback {
	
	ArrayList<CallQualityFeedBack> item=new ArrayList<>();
	
	Feedback(){
		item.listIterator().add(new CallQualityFeedBack(1, "9789869", "Good quality", 4));
		item.listIterator().add(new CallQualityFeedBack(2, "9863249", "OK quality", 2));
	}
	
	
	public void forEachItem(Consumer<CallQualityFeedBack> c) {
		for(CallQualityFeedBack i:item) {
			c.accept(i);
		}
	}
	
	public void forEachItem(Predicate<CallQualityFeedBack> c) {
		for(CallQualityFeedBack i:item) {
			if(c.test(i)) {
				System.out.println("Good");
			}
			else {
				System.out.println("Not");
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Feedback fb = new Feedback();
		fb.forEachItem((e)->System.out.println(e));
		fb.forEachItem((e)->e.getRating()>3);

	}

}
