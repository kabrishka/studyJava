package Inheritance_Figure;

//если перед классом final, то от него нельзя уже наследовать
public final class Triangle extends Figure{
    private double c;

    public Triangle(double a, double b, double c){
        super(a,b);
        this.c = c;
    }

    public Triangle(double size){
        super(size,size);
        this.c = size;
    }

    @Override
    public double square() {
        double p = (getA() + getB() + c)/2;
        return Math.sqrt(p*(p-getA())*(p-getB())*(p-c));
    }
}
