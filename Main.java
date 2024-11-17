public class Main {
    public static void main(String[] args) {

        String[][] myArray = {{"3", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "7", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            int sumOfArray = MyArray.getArray(myArray);
            System.out.println(sumOfArray);


        } catch (MyArraySizeException e) {
            e.getMessage();
        } catch (MyArrayDataException e) {
            e.getMessage();

            System.out.println(e.getMessage());
        } finally{


        }

    }
}


