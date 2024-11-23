public class MyArrayDataException extends Exception {

    public MyArrayDataException(String info) {

        super(" Неверные данные в " + info);
    }
}


