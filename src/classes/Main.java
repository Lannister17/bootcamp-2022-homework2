package classes;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();
        customerManager=customerManager1;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);
    }
}
