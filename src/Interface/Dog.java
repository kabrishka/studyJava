package Interface;

public class Dog extends Animal implements CanRun{
    @Override
    public void eat(){
        System.out.println("Dog is eatting");
    }

    public void run(){
        System.out.println("Dog is running");
    }
}
