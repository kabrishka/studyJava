package HomeTasks.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i < 10;i++){
            numbers.add(i);
        }
        ArrayList<String> names = new ArrayList<>();
        for(char i=65;i<75;i++){
            names.add(Character.toString(i));
        }

        ArrayList<String> list3 = new ArrayList<>();
        for(int i=0; i<numbers.size();i++){
            String str = numbers.get(i) + " - " + names.get(i);
            list3.add(str);
        }

        for (String str:names) {
            System.out.println(str);

        }
    }
}
