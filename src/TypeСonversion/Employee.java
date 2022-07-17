package TypeСonversion;

public class Employee extends Person{
    private String company;

    public Employee(String name, String company){
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void showInfo(){
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }


}
