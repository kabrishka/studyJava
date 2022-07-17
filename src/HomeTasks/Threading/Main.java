package HomeTasks.Threading;

import javax.swing.plaf.TableHeaderUI;

public class Main {

    static boolean isFind = false;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1000000);
        System.out.println(random);

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while(!isFind){
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while(!isFind){
                    int guessNumber = (int) (Math.random() * 1000000);
                    if(guessNumber == random){
                        isFind = true;
                        System.out.println(guessNumber);
                    }
                }
            }
        });
    }
}
