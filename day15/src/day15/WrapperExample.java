package day15;

public class WrapperExample {
    public static void main(String[] args) {
        int primitiveInt = 42;

        // Using the Integer wrapper class to convert int to Integer
        Integer wrappedInt = Integer.valueOf(primitiveInt);

        // Converting Integer back to int using unboxing
        int unboxedInt = wrappedInt.intValue();

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unboxed int: " + unboxedInt);
    }
}
