public class Employee {

    private String name;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void aboutEmployee() {
        System.out.println("Сотрудник " + " " + name + ", возраст" + " " + age + ". " + "Информация о сотруднике:" +
                " " + "почта" + " " + email + ";" + " " + "телефон" +
                " " + phone + ";" + " " + "зп" + " " + salary);
    }

}

