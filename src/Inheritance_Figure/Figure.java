package Inheritance_Figure;

public abstract class Figure {
    private double a;
    private double b;

    public Figure(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    //если метод не имеет своей реализации и он обязательно должен быть переопределен
    //=> если есть хоть один асбтрактный метод, то и класс должен быть абстрактный
    public abstract double square();
}
