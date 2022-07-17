package TypeСonversion;

public class Client extends Person{
    private String bank;
    private int sum;

    public Client(String name, String bank, int sum){
        super(name);
        this.bank = bank;
        this.sum = sum;
    }

    public String getBank() {
        return bank;
    }

    public int getSum() {
        return sum;
    }

    public void showInfo(){
        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }
}
