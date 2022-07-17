package HomeTasks.Monster;

public class Monster {
    int eyes, legs, hands;

    Monster(int eyes){
        this.eyes = eyes;
        legs = 2;
        hands = 2;
    }
    Monster(int eyes, int legs){
        this.eyes = eyes;
        this.legs = legs;
        hands = 2;
    }
    Monster(int eyes, int legs, int hands){
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }
    Monster(){
        eyes = 2;
        legs = 2;
        hands = 2;
    }

    void voice(){
        System.out.println("Voice!");
    }
    void voice(int count){
        System.out.println("Voice!".repeat(count));
    }
    void voice(int count,String str){
        System.out.println(str.repeat(count));
    }
}
