public class MyArray {


    public static int getArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException {


        if (myArray.length != 4) {
            throw new MyArraySizeException("Неверная длинна массива");
        }
        int sum = 0;


        for (int row = 0; row < myArray.length; row++) {
            if(myArray[row].length!=4)
                throw new MyArraySizeException("Неверная длинна массива");
            for (int column = 0; column < myArray[row].length;column++) {
                try {

                    sum +=Integer.parseInt(String.valueOf(myArray[row][column]));

                } catch (NumberFormatException e) {
                    String info = row+ "." + column + " ячейке";
                    throw new MyArrayDataException(info);


                }

            }
        }
        return sum;

    }

}


