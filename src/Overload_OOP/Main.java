package Overload_OOP;

public class Main {
    public static void main(String[] args) {
        //если используем статический метод, можно не создавать объект класса
        int rezult = AboutStatic.multiple(5);
        System.out.println(rezult);
        double l = AboutStatic.circumferenceLength(10);
        System.out.println(l);
        int sum = AboutStatic.summ(1,3,5,7,9,10);
        System.out.println(sum);
    }

}
