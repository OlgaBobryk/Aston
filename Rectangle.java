public class Rectangle implements Figure {

    private double length;
    private double width;
    private String backColorOfRectangle;
    private String borderColorOfRectangle;

    public Rectangle(double length, double width, String backColorOfRectangle, String borderColorOfRectangle) {
        this.length = length;
        this.width = width;
        this.backColorOfRectangle = backColorOfRectangle;
        this.borderColorOfRectangle = borderColorOfRectangle;

    }

    @Override
    public double printArea() {
        return width * length;

    }

    @Override
    public double printPerimeter() {

        return 2 * (width + length);


    }

    @Override
    public String backgroundColor() {
        return backColorOfRectangle;
    }

    @Override
    public String borderColor() {
        return borderColorOfRectangle;
    }


}
