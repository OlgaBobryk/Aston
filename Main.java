public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(23, "белый", "черный");
        Triangle triangle = new Triangle(12, 17, 13, 21,
                "красный", "желтый");
        Rectangle rectangle = new Rectangle(31, 12, "синий", "красный");

        circle.printInfo();
        triangle.printInfo();
        rectangle.printInfo();
    }
}
