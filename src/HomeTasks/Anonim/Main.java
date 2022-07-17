package HomeTasks.Anonim;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Counter() {
            @Override
            public String report(int months) {
                String str = "Report of " + months + " months";
                return str;
            }
        }, 12);
    }
}
