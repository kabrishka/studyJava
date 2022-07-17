package HomeTasks.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box weightBox = new BoxWeight(1,2,3,4);
        box1.showInfo();
        weightBox.showInfo();
    }
}
