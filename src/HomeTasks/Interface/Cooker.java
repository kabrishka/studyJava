package HomeTasks.Interface;

public class Cooker extends Employee implements Cookble{
    public Cooker(String name){
        super(name);
    }
     @Override
    public void cooking(){
         System.out.printf("%s is backing a cake\n", getName());
     }

}
