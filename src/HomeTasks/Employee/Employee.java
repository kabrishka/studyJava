package HomeTasks.Employee;

public class Employee {
    String name;
    String post;
    int salary;

    Employee(String name, String post, int salary){
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    String infoAboutEmployee(int months){
        String info = name+ " who holds the position of " + post + " received $" + salary*months + " in " + months + " months";
        return info;
    }
}
