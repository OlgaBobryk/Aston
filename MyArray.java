public class MyArray {


    public static int getArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException {


        if (myArray.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        int row;
        int column;
        int number;

        for (int i = 0; i < myArray.length; i++) {
            row = i;
            for (int j = 0; j < myArray[i].length; j++) {
                column = j;
                try {
                    number = Integer.parseInt(String.valueOf(myArray[i][j]));
                    sum = sum + number;

                } catch (NumberFormatException e) {
                    String info = String.valueOf(row) + "." + String.valueOf(column) + " ячейке";
                    throw new MyArrayDataException(info);


                }

            }
        }
        return sum;

    }

}


