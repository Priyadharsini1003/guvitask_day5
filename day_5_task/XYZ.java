package product;
import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter Employee ID, Name, and Salary:");
        String empId = scanner.next();
        String name = scanner.next();
        double salary = scanner.nextDouble();
        Employee employee = new Employee(empId, name, salary);
        
       
        System.out.println("Enter Product ID, Price, and Quantity:");
        String pid = scanner.next();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        Product product = new Product(pid, price, quantity);

       
        System.out.println("Income Tax for Employee: " + employee.calcTax());
        System.out.println("Sales Tax for Product: " + product.calcTax());

        scanner.close();
    }
}

