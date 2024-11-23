public interface Figure {


    double printArea();

    double printPerimeter();

    String backgroundColor();

    String borderColor();

   default void printInfo(){
       System.out.println("[ Площадь  " + printArea() + ",  Периметр   " + printPerimeter() +
               ", Цвет заливки   " + backgroundColor() + ", Цвет границ  " + borderColor() + " ]");
   }

}
