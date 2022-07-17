package HomeTasks.Inheritance;

public class Box {
    private int height;
    private int width;
    private int length;

    public Box(){
        height = 0;
        width = 0;
        length = 0;
    }
    public Box(int height, int width, int length){
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public Box(int size){
        height = size;
        width = size;
        length = size;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public void showInfo(){
        System.out.println("Height = " + height
                            + "\nWidth = " + width
                            + "\nLenght = " + length);
    }

}
