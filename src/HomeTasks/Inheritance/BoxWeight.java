package HomeTasks.Inheritance;

public class BoxWeight extends Box{
    private int weight;

    public BoxWeight(){
        super();
        this.weight = 0;
    }
    public BoxWeight(int height, int width, int length, int weight){
        super(height, width, length);
        this.weight = weight;
    }
    public BoxWeight(int size, int weight){
        super(size);
        this.weight = size;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight = " + weight);
    }
}
