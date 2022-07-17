package Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        try{
            int b = 7 / a;
        }
        catch (ArithmeticException e){
            System.out.println("/by 0");
        }

    }
}
