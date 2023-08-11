package day15;

public class Shape {

    public void calculate(Area areaCalculator, int sides) {
        areaCalculator.calculateArea(sides);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.calculate((s) -> {
            int a = s * s;
            System.out.println("Side of Square= " + s + "\nArea= " + a);
        }, 4);
    }
}