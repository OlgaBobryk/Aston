public class Circle implements Figure {
    private double radius;
    private String backColorOfCircle;
    private String borderColorOfCircle;

    public Circle(double radius, String backColorOfCircle, String borderColorOfCircle) {
        this.radius = radius;
        this.backColorOfCircle = backColorOfCircle;
        this.borderColorOfCircle = borderColorOfCircle;
    }


    @Override
    public double printArea() {
        return
                (Math.PI * radius * radius);

    }

    @Override
    public double printPerimeter() {

        return (2 * Math.PI * radius);

    }

    @Override
    public String backgroundColor() {

        return backColorOfCircle;
    }

    @Override
    public String borderColor() {
        return borderColorOfCircle;
    }

}
