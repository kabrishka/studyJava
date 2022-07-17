package Themes;

import java.util.Arrays;
import  java.util.Scanner;

public class Spaces {
    public static void main(String[] args) {
        String str = "Hello world world!";

        //проверка содержит ли строка подстроку
        System.out.println("S1 contains \"world\" " + str.contains("world"));

        //первое вхождение символа/первого символа подстроки
        System.out.println("str.indexOf(\"world\") " + str.indexOf("world"));
        //последнее вхождение символа/первого символа подстроки
        System.out.println("str.lastIndexOf(\"world\") " + str.lastIndexOf("world"));

        //начинается ли строка с подстроки
        System.out.println(str.startsWith("Hello"));
        //завершает ли подстрокой
        System.out.println(str.endsWith("world!"));

        //пустая ли строка
        System.out.println("Is empty "+ str.isEmpty());
        System.out.println("".isEmpty());

        //генерация новых строк на базе существующих !! СОЗДАЮТСЯ НОВЫЕ СТРОКИ
        //приведение строки к верхнему/нижнему регистру
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        //потвроить строку n раз
        System.out.println(str.repeat(3));

        //замена символов/подстрок
        System.out.println(str.replace('H','Q'));
        System.out.println(str.replace("Hello","Bye"));

        //вырезать подстроку начиная с индекса [n заканчивая индексом m)
        System.out.println(str.substring(6,12));

        //разделить строку на массив по условию
        System.out.println(Arrays.toString(str.split(" ")));

        /*String cmd = new Scanner(System.in).nextLine();
        System.out.println(cmd);*/

        //сравнение
        String s1 = "Hello";
        String s2 = "world";

        //s1 == s2
        //для игнорирования регистра equalsIgnoreCase()
        if(s1.equals(s2)){
            System.out.println("s1 == s2");
        }
        //s1 > s2 (compareTo возвращает int ><=0)
        //сравнения идет по первым символам ASCII
        if(s1.compareTo(s2) > 0){
            System.out.println("s1 > s2");
        }
        //сравнения идет по первым символам ASCII
        if(s2.compareTo(s1) > 0){
            System.out.println("s2 > s1");
        }


    }
}
