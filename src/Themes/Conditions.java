package Themes;

public class Conditions {
    public static void main(String[] args) {
        int currTime = 10;
        boolean isNight;
        if(currTime > 22){
            isNight = true;
        }
        else{
            isNight = false;
        }
        boolean isSun = true;

        if(isNight){
            System.out.println("Go to bed!");
        }
        if(!isNight && isSun == true){
            System.out.println("Go to a walk!");
        }
        if(!isNight && !isSun){
            System.out.println("Stay at home and read a book!");
        }
    }
}
