public class Triangle implements Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private String borderColorOfTriangle;
    private String backColorOfTriangle;

    public Triangle(double sideA, double sideB, double sideC,
                    String backColorOfTriangle, String borderColorOfTriangle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        this.backColorOfTriangle = backColorOfTriangle;
        this.borderColorOfTriangle = borderColorOfTriangle;

    }


    @Override
    public double printArea() {
        return Math.sqrt(printPerimeter() / 2 * (printPerimeter() / 2 - sideA) * (printPerimeter() / 2 - sideB)
                * (printPerimeter() / 2 - sideC));

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


}

