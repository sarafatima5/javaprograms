package day15;

import java.util.function.Predicate;

public class Candidate {
	public void checkAge(int age) {
        if (age > 18) {
            System.out.println("valid age");
        } else {
            System.out.println("invalid age");
        }
    }

}

