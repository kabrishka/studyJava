package Interface;

public class Cat extends Animal implements CanRun{
    @Override
    public void eat(){
        System.out.println("Cat is eatting");
    }

    @Override
    public void run(){
        System.out.println("Cat is running");
    }
}
