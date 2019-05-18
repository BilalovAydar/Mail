public class Employee {
    public String FIO;
    public String job;
    public String email;
    public String tel;
    public int salary;
    public int age;

    public Employee(String FIO, String job, String email, String tel, int salary, int age) {
        this.FIO = FIO;
        this.job = job;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void Information(){
        System.out.print("FIO: " + FIO + "\njob: " + job + "\nemail: " + email + "\ntel: " + tel + "\nsalary: " + salary + "\nage: " + age);
        System.out.println();
    }

}
