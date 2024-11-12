public class Triangle implements Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private double height;
    private String borderColorOfTriangle;
    private String backColorOfTriangle;

    public Triangle(double sideA, double sideB, double sideC, double height,
                    String backColorOfTriangle, String borderColorOfTriangle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        this.backColorOfTriangle = backColorOfTriangle;
        this.borderColorOfTriangle = borderColorOfTriangle;

    }


    @Override
    public double printArea() {
        return (sideA + height) / 2;

    }

    @Override
    public double printPerimeter() {
        return sideA + sideB + sideC;


    }

    @Override
    public String backgroundColor() {
        return backColorOfTriangle;
    }

    @Override
    public String borderColor() {
        return borderColorOfTriangle;
    }

    @Override
    public void printInfo() {
        System.out.println("[ Площадь треугольника " + printArea() + ", Периметр треугольника  " + printPerimeter() +
                ", Цвет заливки треугольника  " + backgroundColor() +
                ", Цвет границ треугольника " + borderColor() + " ]");


    }
}
