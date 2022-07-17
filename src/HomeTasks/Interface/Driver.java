package HomeTasks.Interface;

public class Driver extends Employee implements Driveble{
    public Driver(String name){
        super(name);
    }

    @Override
    public void driving(){
        System.out.printf("%s is driving a car\n", getName());
    }
}
