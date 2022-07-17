package Themes;

public class TypesOfVariables {
    public static void main(String[] args) {
        //int = 4 byte
        int days = 5000;
        int years = days/365;
        int months = (days%365)/31;
        System.out.println("Days = "+days+"\nYaers = "+years+"\nMonths = "+ months);

        //byte = 1 byte  [-128;127]
        byte a = 127;
        a += 1;//бдует присвоено минимальное возможное = -128
        System.out.println(a);
        a += 1;// -128 + 1 = -127
        System.out.println(a);

        int c = 15;
        //в java нет автоматического привидения типа к более мелкому типу
        byte d = (byte)c;
        System.out.println(d);

        //long = 8 byte
        days = 1000;
        int speed = 300000;
        long second = 1000 * 24 * 60 * 60;
        long dist = speed * second;
        System.out.println(dist);

        //float = 4 byte
        //double = 8 byte (более точный)
        float r = 3f;
        float v = 4f;
        float h = (float) Math.sqrt(Math.pow(r,2)+Math.pow(v,2));
        System.out.println("Hypothen = "+ h);

        //char
        char ch1 = 88;//код символа из таблица ASCII
        char ch2 = 'X';
        System.out.println("Ch1 - "+ch1+"\nCh2 - "+ch2);
    }
}
