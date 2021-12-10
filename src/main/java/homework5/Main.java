package homework5;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivanov.ivan@mailbox.com", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Petrov Petr", "Manager", "petrov.petr@mailbox.com", "892312313", 15000, 25);
        employeeArray[2] = new Employee("Kontorbayev Almas", "Director", "kontorbayev.almas@mailbox.com", "892312314", 100000, 55);
        employeeArray[3] = new Employee("Kim Sergey", "DevOps", "kim.sergey@mailbox.com", "892312315", 70000, 35);
        employeeArray[4] = new Employee("Some Dude", "TeamLead", "some.dude@mailbox.com", "892312316", 80000, 41);

        for (int i = 0; i < employeeArray.length; i++) {
            if(employeeArray[i].getAge() >= 40) {
                employeeArray[i].toString();
            }
        }
    }
}
