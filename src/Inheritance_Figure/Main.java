package Inheritance_Figure;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(5,10);
        Triangle triangle = new Triangle(10);
        System.out.println(rect.square());
        System.out.println(triangle.square());
    }
}
