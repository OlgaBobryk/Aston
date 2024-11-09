package Lesson4;

public class Employee {

    String name;
    String email;
    String phone;
    int salary;
    int age;

    public void aboutEmployee() {
        System.out.println("Сотрудник " + " " + name + ", возраст" + " " + age + ". " + "Информация о сотруднике:" +
                " " + "почта" + " " + email + ";" + " " + "телефон" +
                " " + phone + ";" + " " + "зп" + " " + salary);
    }

}

