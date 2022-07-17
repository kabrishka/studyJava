package HomeTasks.Interface;

public class Programmer extends Employee implements Programble{
    public Programmer(String name){
        super(name);
    }
    @Override
    public void programming(){
        System.out.printf("%s is writing code\n", getName());
    }
}
