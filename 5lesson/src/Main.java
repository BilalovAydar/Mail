public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иванов Иван Иванович","инженер","abs@g.com","+791111111",30000,37);
        empl[1] = new Employee("Петров Петр Петрович","администратор","def@g.com","+791111111",30000,39);
        empl[2] = new Employee("Васильев Василий Васильевич","верстальщик","ghi@g.com","+791111111",30000,42);
        empl[3] = new Employee("Геннадьев Геннадий Геннадьевич","аналитик","jkl@g.com","+791111111",30000,45);
        empl[4] = new Employee("Дмитриев Дмитрий Дмитриевич","технолог","zxc@g.com","+791111111",30000,30);

        for (int i = 0; i < empl.length; i++){
            if (empl[i].age >= 40) {
                System.out.println("сотрудник:\n");
                empl[i].Information();
            }
        }

    }
}
