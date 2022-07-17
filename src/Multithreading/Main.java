package Multithreading;

public class Main {
    static boolean isFive = false;

    public static void main(String[] args) {
        //Создаем поток
        //1 способ
        /*RunnableTimer runnableTimer = new RunnableTimer();
        Thread timer = new Thread(runnableTimer);
        timer.start();
        for(int i=0; i<1000000; i++){
            System.out.println(2);
        }*/



        //Чтобы поток мог выполнить к-н операцию, ему необходимо передать в качестве параметра объект класса, который реализует интерфейс Runnable
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while(true){
                        if(i == 5){
                            isFive = true;
                        }
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        });
        timer.start();


        //чтобы второй работал до тех пор, пока первый не дойдет до цифры 5
        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while(!isFive){
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        });
        timer2.start();
    }
}
