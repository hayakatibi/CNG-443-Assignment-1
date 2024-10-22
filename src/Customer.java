import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    private int customerId;
    private String name,surname;
    private Date registrationDate;
    private Order [] orders;

    public Customer(int customerId, String name, String surname) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
    }

    public void putOrder(int customerId){
        //Order order = new Order();
        Scanner input = new Scanner(System.in);

        int numberOfItems;
        String type,notes;
        int quantity,price,employeeId;
        System.out.print("How many items do you want to add? ");
        numberOfItems = input.nextInt();
        Random rand = new Random();
        Employee employee;
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Enter the type of item (e.g., skirt, shirt, etc): ");
            type = input.nextLine();
            System.out.print("Enter quantity (e.g., 2): ");
            quantity = input.nextInt();
            System.out.println("Enter price: ");
            price = input.nextInt();
            System.out.println("Enter a note");
            notes = input.nextLine();
            employeeId = rand.nextInt(1,Employee.getEmployeeCount());

            //LaundryItem item = new LaundryItem(type,quantity,price,notes,)
        }
    }
}
