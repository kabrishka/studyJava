package HomeTasks.Box;

public class Box {
    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length){
        this.height = height;
        this.width= width;
        this.length = length;
    }
    public Box(double size) {
        height = size;
        width= size;
        length = size;
    }
    public Box(Box box1, Box box2){
        this.height = box1.height + box2.height;
        this.width= box1.width + box2.width;
        this.length = box1.length + box2.length;
    }

    public double volume() {
        return width * height * length;
    }

    public Box createBigBox(Box box){
        return new Box(this.height+ box.height,this.width+box.width,this.length+box.length);
    }
}
