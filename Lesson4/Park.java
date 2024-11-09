package Lesson4;

public class Park {

    private Attraction attriction;

    public static class Attraction {

        String nameOfAttraction;
        int price;
        String time;

        public Attraction(String nameOfAttraction,String time, int price){
            this.nameOfAttraction=nameOfAttraction;
            this.time=time;
            this.price=price;
        }
        public void infoAboutAttraction(){
            System.out.println("Атракцион "  + nameOfAttraction + ", " + "время " + time + ", " + "стоимость " +  price
            + ".");

        }

    }
}
