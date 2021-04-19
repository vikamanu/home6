package home5;


// SOLID
public class home55 {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int age;
    private double salary;

    public home55(String fio,
                  String position,
                  String email,
                  String phone,
                  int age,
                  double salary) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void printInfo(){
       System.out.println(" Fio: " + fio + ", position: " + position + ", emal: " + email + ", phone: " + phone
       + ", age: " + age + "," + "salary: " + salary);
    }
}