package HomeTasks.Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Jack");
        Driver driver = new Driver("Sarah");
        Cooker cooker = new Cooker("Lisa");

        //Перекличка
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer);
        employees.add(driver);
        employees.add(cooker);
        for (Employee employee : employees){
            employee.voice();
        }

        //Заставляем всех работать
        programmer.programming();
        driver.driving();
        cooker.cooking();

    }
}
