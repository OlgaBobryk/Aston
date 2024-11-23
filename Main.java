public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(23, "белый", "черный");
        Triangle triangle = new Triangle(12, 17, 13,
                "красный", "желтый");
        Rectangle rectangle = new Rectangle(31, 12, "синий", "красный");

        System.out.print("Круг: ");
        circle.printInfo();
        System.out.print("Треугольник: ");
        triangle.printInfo();
        System.out.print("Прямоугольник: "); rectangle.printInfo();

        System.out.println(" ");

        Cat cat = new Cat("Пушистик", 14);
        Cat cat1 = new Cat("Лапушка", 4);
        Cat cat2 = new Cat("Фикс", 12);


        Dog dog = new Dog("Бобик");
        Dog dog1 = new Dog("Куба");
        Dog dog2 = new Dog("Тим");

        cat.running(180);
        cat1.running(0);
        cat2.running(250);

        cat.swimming(120);

        dog.running(0);
        dog1.running(400);
        dog2.running(600);


        System.out.println("Кол-во котов " + Cat.getCountCat());
        System.out.println("Кол-во собак " + Dog.getCountDog());
        System.out.println("Кол-во животных " + (Cat.getCountCat() + Dog.getCountDog()));


        CatBowl bowl = new CatBowl(12);

        bowl.getFoodInBowl();
        cat.eating(bowl);
        bowl.addFood(1);
        cat2.eating(bowl);

        CatBowl bowl2 = new CatBowl(19);
        Cat[] catsArray = new Cat[3];
        catsArray[0] = cat;
        catsArray[1] = cat1;
        catsArray[2] = cat2;

        for (int i = 0; i <= catsArray.length; i++) {
            catsArray[i].eating(bowl2);

        }

    }
}
