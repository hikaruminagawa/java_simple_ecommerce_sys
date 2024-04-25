import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.orders.Order;

public class Main {
    public static void main(String[] args) {
        // Create instances of products
        Product product1 = new Product("P1", "Product 1", 100.0);
        Product product2 = new Product("P2", "Product 2", 200.0);

        // Create an instance of a customer
        Customer customer = new Customer("C1", "Customer 1");

        // Allow the customer to browse products and add them to their shopping cart
        customer.addToCart(product1);
        customer.addToCart(product2);

        // Allow the customer to place an order
        Order order = customer.placeOrder();

        // Display information about products, customers, and orders
        System.out.println("Products:");
        System.out.println("- " + product1.getName() + ": $" + product1.getPrice());
        System.out.println("- " + product2.getName() + ": $" + product2.getPrice());

        System.out.println("\nCustomer:");
        System.out.println("- " + customer.getName());

        System.out.println("\nOrder:");
        System.out.println(order.generateOrderSummary());
    }
}
