import exercise1.*;
import exercise2.*;

public class App {
    public static void main(String[] args) {
        System.out.println(" Exercise 1");

        Exercise1.InputNumber();

        System.out.println("\n\nEnd Exercise 1 \n\n");
        System.out.println("Exercise 2\n\n");

        Customer customer = new Customer("LORN SAMNANG", "Premium");
        Sale sale = new Sale(customer, "2024-02-21");
        sale.setServiceExpense(400.0);
        sale.setProductExpense(250.0);
        sale.displayInfo();
        System.out.println("\n\nEnd Exercise 2 \n\n");

    }
}
