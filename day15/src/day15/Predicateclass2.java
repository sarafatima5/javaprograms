package day15;

import java.util.function.Predicate;

public class Predicateclass2 {
	    public static void main(String[] args) {
	        int[] agearray = {12, 23, 11, 19, 35, 22};

	        Candidate candidate = new Candidate();
	        Predicate<Integer> ageValidator = a->(a>18);
	        
	        for (int age : agearray) {
	            //System.out.println(ageValidator.test(age));
	            candidate.checkAge(age);
	        }
	    }
	

}
