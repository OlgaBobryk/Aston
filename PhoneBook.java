import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> phBook = new HashMap<>();

    public void add(String name, String phone) {
        if (phBook.containsKey(name)) {
            List<String> phNumbers = phBook.get(name);
            phNumbers.add(phone);

        } else {
            List<String> phNumbers = new ArrayList<>();
            phNumbers.add(phone);
            phBook.put(name, phNumbers);

        }

    }

    public List<String> get(String name) {
        System.out.println("Номера телефонов для " + name + " " + phBook.get(name));
        return phBook.get(name);
    }
}
