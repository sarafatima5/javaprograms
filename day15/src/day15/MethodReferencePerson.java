package day15;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencePerson {
	
	public static void printPersonInfo(Person person) {
        System.out.println("Name: " + person.getName() + ", Email: " + person.getEmail());
    }
	
    public static void main(String[] args) {
   
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", "Alice@gmail.com"));
        personList.add(new Person("Bob", "Bob@gmail.com"));
        personList.add(new Person("Xyz", "Xyz@gmail.com"));

        
        System.out.println("Iterating through objects using method references:");
        personList.forEach(MethodReferencePerson::printPersonInfo);
    }

}
