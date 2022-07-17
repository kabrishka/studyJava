package Anonim;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        /*Cooker cooker = new Cooker();
        director.force(cooker);*/

        //Анонимные классы - классы, у которых нет имени
        //Они нужны, если иы используем класс всего один раз
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("I'm cooking");
            }
        });
    }
}
