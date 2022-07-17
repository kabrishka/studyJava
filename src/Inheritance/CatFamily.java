package Inheritance;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

    public CatFamily(int ears, int legs, boolean bigClaws){
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void showInfo(){
        System.out.println("Count ears: "+ears+"\nCount legs: "+legs+"\nBig claws is "+bigClaws);
    }

    //тк BigClaws private, но мы хотим изменить это поле у ребенка, то сделаем setter
    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public void eat() {
        System.out.println("I'm eating");
    }
}
