package Themes;

public class Loops {
    public static void main(String[] args) {
        int i = 0;
        double summ = 0;
        while(i<=100){
            summ +=i;
            i++;
        }
        summ/= (i-1);
        System.out.println(summ);



    }
}
