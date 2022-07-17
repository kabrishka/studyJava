package Overload_OOP;

public class AboutStatic {
    //если стоит final, то переменной можно присвоить значение только 1 раз
    private static final double PI = 3.14;
    //если созданный метод ведет себя одинаково не зависимо от объектов, если не использует переменных экземляра, можем использовать static
    public static int multiple(int a, int b){
        return a*b;
    }
    public static double multiple(double a, double b){
        return a*b;
    }
    public static int multiple(int a){
        return a*a;
    }
    public static double circumferenceLength(double R){
        return  2 * PI * R;
    }

    //сумма n-чисел
    //с numbers можно работать как с массивом
    public static int summ(int... numbers){
        int sum = 0;
        for(int i:numbers) {
            sum+=i;
        }
        return sum;
    }

}
