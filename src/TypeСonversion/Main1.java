package TypeСonversion;

public class Main1 {
    public static void main(String[] args) {
        //        Object
        //          |
        //        Person
        //        /   \
        //  Employee  Client

        //Upcasting (автом) - восходящее препобразование (от подкласса к суперклассу)
        //Laura не имеет доступа к методам Person
        //Alice не имеет досутпа к методам Employee
        //но метод showInfo,будет выводить то, что написано в дочернем классе
        //тк мы его переопределили
        Object laura = new Person("Kate");
        Person alice = new Employee("Alice", "Google");


        //Downcasting (не автом) - нисходящее преобразование (от суперкласса к подклассу)
        //Не всегда верно, что суперкласс является объектом подкласса
        //например, Person не всегда Employee
        Object sam = new Client("Sam", "RussianBank", 1000);

        //Нисходящее преобразование от Object к типу Employee
        //обратимся к методу getBank
        //тк в Object нет такого метода, но он есть в Client
        //преобразуем тип Object к типу Employee
        // ((Client)sam).getBank()
        System.out.println(((Client)sam).getBank());


        //Оператор instanceof
        //Выражение kate instanceof Employee проверяет, является ли переменная kate объектом типа Employee.
        // Но так как в данном случае явно не является, то такая проверка вернет значение false, и преобразование не сработает.
        Object kate = new Client("Kate", "DeutscheBank", 2000);
        if(kate instanceof Employee){

            Employee employeeKate = (Employee) kate;
            employeeKate.showInfo();
        }
        else{

            System.out.println("Conversion is invalid");
        }

    }
}
