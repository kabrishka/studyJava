package Interface;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        //Заставляем в цикле всех покушать
        //Полиморфизм - один интерфейс, множество реализаций
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        for (Animal animal : animals) {
            animal.eat();
        }

        Dog dog1 = new Dog();
        dog1.run();
        Animal animal = dog1;//dog1 привели к родительскому типу, animal ссылается на dog1
        //animal.run();, тк animal не содержит метода run
        dog1 = (Dog)animal;//animalo привели к дочернему типу

    }
}
