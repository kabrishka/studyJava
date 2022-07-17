package Modificators;

import Modificators.man.Man;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("John",21);
        man.setAge(29);
        System.out.println(man.getAge());

    }
}
