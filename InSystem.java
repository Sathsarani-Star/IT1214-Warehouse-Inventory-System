import java.util.Scanner;

public class InSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n--- Warehouse Inventory System ---");
            System.out.println("1. Add Item");
            System.out.println("2. View Items");
            System.out.println("3. Update Quantity");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    inventory.addItem(name, qty);
                    break;

                case 2:
                    inventory.viewItems();
                    break;

                case 3:
                    System.out.print("Enter item name to update: ");
                    String updateName = sc.nextLine();

                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();

                    inventory.updateItem(updateName, newQty);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}