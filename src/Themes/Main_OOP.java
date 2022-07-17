package Themes;

public class Main_OOP {
    public static void main(String[] args) {
        ClassBox myBox1 = new ClassBox(10,10,10);
/*        myBox1.height = 10;
        myBox1.length = 10;
        myBox1.width = 10;*/

        ClassBox myBox2 = myBox1; // они оба ссылаются на одну и ту же коробку
        myBox2.width = 12;// будет измененно и у myBox1

        System.out.println(myBox1.volume());

        ClassBox constructorBox = new ClassBox(12,12,12);
        System.out.println(constructorBox.volume());

        ClassBox squareBox = new ClassBox(5);
        System.out.println(squareBox.volume());

        ClassBox exBox1 = new ClassBox(6);
        //в данном случае exBox2 не явялется ссылкой на ту же коробку, что и exBox1
        ClassBox exBox2 = new ClassBox(exBox1);

        //используем метод, возвращающий коробку
        ClassBox box1 = new ClassBox(7);
        ClassBox box2 = box1.increase();
        System.out.println("Height 1 = " + box1.height + "\nWidth 1 = "+ box1.width+ "\nLength 1 ="+box1.length);
        System.out.println("Height 2 = " + box2.height + "\nWidth 2 = "+ box2.width+ "\nLength 2 ="+box2.length);
    }
}
