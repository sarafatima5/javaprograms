package day15;

import java.util.function.Predicate;

public class Predicateclass {
	 public static boolean Even(int num) {
	        return num % 2 == 0;
	    }

public static void main(String[] args) {
	int[] arr = {12, 23, 11, 19, 25, 32, 16, 22};

    
    Predicate<Integer> isEven = Predicateclass::Even;
    for (int num : arr) {
        if (isEven.test(num)) {
            System.out.println(num);
        }
}
}
}
