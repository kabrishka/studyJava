package Interface;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        //Хотим заставить бежать и котов, и собак
        //Но метод run прописан отдельно в классе Cat, отдельно в классе Dog
        //мы не сможем создать ArrayList<Animal> тк в Animal нет метода run
        //используем интерфейс!
        ArrayList<CanRun> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        for(CanRun animal : animals){
            animal.run();
        }


    }
}
