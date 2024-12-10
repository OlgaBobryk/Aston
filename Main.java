import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "доллар", "евро", "крона", "злотый", "рубль",
                "сум", "тенге", "рубль", "доллар", "доллар",
                "лари", "лари", "евро", "юань", "фунт",
                "фунт", "песо", "песо", "песо", "песо"
        };

        Words.findUniqueWords(words);

        Map<String, Integer> map = Words.getCountOfWords(words);
        System.out.println(map);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "123456");
        phoneBook.add("Sidorov", "14789");
        phoneBook.add("Ivanov", "77777");
        phoneBook.add("Vasiljew", "000000");
        phoneBook.add("Vasiljew", "45689");
        phoneBook.add("Ivanov", "111117");
        phoneBook.get("Ivanov");


    }
}


