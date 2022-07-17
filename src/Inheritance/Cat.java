package Inheritance;

public class Cat extends CatFamily{
    //вызов РОДИТЕЛЬСКОГО конструктора
    public Cat(){
        super(2,4,false);
    }

    //переопределение метода суперкласса (помечается как override)
    @Override
    public void eat(){
        super.eat();
        System.out.println("cheese");
    }
}
