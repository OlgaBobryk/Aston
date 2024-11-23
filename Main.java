public class Main {
    public static void main(String[] args) {

        String[][] myArray = {{"3", "2", "оро", "4"}, {"1", "2", "3", "4"}, {"1", "7", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            int sumOfArray = MyArray.getArray(myArray);
            System.out.println("Сумма всех элементов массива =" + sumOfArray);


        } catch (MyArraySizeException e) {
            System.out.println( e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println( e.getMessage());



        }

    }
}


