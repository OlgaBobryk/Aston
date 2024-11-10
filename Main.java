import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {


        Employee emp = new Employee();
        emp.setName("Васильев Василий Васильевич");
        emp.setAge(31);
        emp.setSalary(1000);
        emp.setEmail("vas@gmail.com");
        emp.setPhone("457895");
        emp.aboutEmployee();
        System.out.println();


        Person[] per = new Person[5];

        per[0] = new Person("Петров Петр Петрович", 30, "Менеджер", "4562222",
                "petr@gmail.com", 1000);
        per[1] = new Person("Сидоров Александр Петрович", 55, "Руководитель отдела",
                "4588888", "sidr@gmail.com", 5000);
        per[2] = new Person("Николаев Николай Николаевич", 27, "Менеджер",
                "4589999", "nik@gmail.com", 1100);
        per[3] = new Person("Васильева Василиса Васильевна", 36, "Бухгалтер",
                "45757522", "vas@gmail.com", 2000);
        per[4] = new Person("Алексеев Алексей Алексеевич", 25, "Стажер",
                "4560002", "alex@gmail.com", 900);


        Park.Attraction attraction = new Park.Attraction("Карусель Лошадки", "12.00", 4);
        Park.Attraction attraction1 = new Park.Attraction("Американские горки", "12.00", 9);
        Park.Attraction attraction2 = new Park.Attraction("Колесо обозрения", "14.00", 6);
        attraction.infoAboutAttraction();
        attraction1.infoAboutAttraction();
        attraction2.infoAboutAttraction();

        ArrayList<Park.Attraction> allAttractions = new ArrayList<>();
        allAttractions.add(attraction);
        allAttractions.add(attraction1);
        allAttractions.add(attraction2);


    }
}

