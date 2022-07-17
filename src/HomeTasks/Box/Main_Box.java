package HomeTasks.Box;

import HomeTasks.Box.Box;

public class Main_Box {
    public static void main(String[] args) {
        Box box1 = new Box(4);
        Box box2 = new Box(1,2,3);
        Box box3 = new Box(box1,box2);
        box1.createBigBox(box2);
    }
}
