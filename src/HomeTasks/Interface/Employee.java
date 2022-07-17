package HomeTasks.Interface;

public class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void voice(){
        System.out.printf("Employee's name: %s\n",name);
    }
}
