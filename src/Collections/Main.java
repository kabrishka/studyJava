package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Sarah");
        employees.add("John");
        employees.add("David");
        employees.add("John J.");
        for(int i=0; i <employees.getSize();i++){
            System.out.println(employees.get(i));
        }
        employees.remove("David");
        for(int i=0; i <employees.getSize();i++){
            System.out.println(employees.get(i));
        }

        //ArrayList<Тип>
        ArrayList<String> employees2 = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //что HashSet, что TreeSet, нет метода get, доступ только через цикл
        //HashSet - исп, если мы не хотим, чтобы в коллекции были повторяющиеся значения
        HashSet<String> names = new HashSet<>();
        names.add("Loopa");
        names.add("Poopa");
        names.add("Poopa");//будет выведено всего один раз
        for (String name:names) {
            System.out.println(name);
        }

        //TreeSet - то же самое, что и HashSet, но данные хранятся в отсортированном виде

    }
}
