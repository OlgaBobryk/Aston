public class Cat extends Animals {
    private static int countCat = 0;
    private boolean hungry;
    private static int appetit;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        countCat++;
        this.hungry = true;

    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public static int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    @Override
    public void running(int run) {
        if (run <= 200 && run > 0) {
            System.out.println(name + " пробежал " + run + " м");
        }
        if (run <= 0) {
            System.out.println(name + "стоял");
        } else {
            System.out.println("Кот не бегает больше " + run + " м");
        }
    }

    @Override
    public void swimming(int run) {
        System.out.println("Кот не умеет плавать");
    }

    public static int getCountCat() {
        return countCat;
    }

    public int eating(CatBowl bowl) {
        if (bowl.getFoodInBowl() <= appetit) {
            return bowl.getFoodInBowl();
        } else {
            bowl.deleteFood();
        }
        return bowl.deleteFood();
    }
}
