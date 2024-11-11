public class Dog extends Animals {
    private static int countDog = 0;

    public Dog(String name) {
        this.name = name;
        countDog++;
    }

    @Override
    public void running(int run) {
        if (run > 0 && run <= 500) {
            System.out.println(name + " пробежал " + run + " м");
        }
        if (run <= 0) {
            System.out.println(name + "стоял");
        } else {
            System.out.println("Собака не бегает больше " + run + " м");

        }
    }

    @Override
    public void swimming(int run) {
        if (run > 0 && run <= 10) {
            System.out.println(name + " проплыл " + run + " м");
        }
        if (run <= 0) {
            System.out.println(name + " не плавал");
        } else {
            System.out.println("Собака не плавает " + run + " м");
        }
    }
    public static int getCountDog(){
        return countDog;
    }
}
