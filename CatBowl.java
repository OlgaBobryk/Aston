public class CatBowl {

    private int foodInBowl;

    public CatBowl(int foodInBowl) {
        this.foodInBowl = foodInBowl;

    }

    public int getFoodInBowl() {
        return foodInBowl;
    }

    public void setFoodInBowl(int foodInBowl) {
        this.foodInBowl = foodInBowl;
    }

    public int addFood(int amountOfAddedFood) {
        foodInBowl += amountOfAddedFood;
        return foodInBowl;

    }

    public int deleteFood() {
        foodInBowl -= Cat.getAppetit();
        return foodInBowl;

    }
}





