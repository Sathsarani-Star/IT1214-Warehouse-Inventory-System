class Item {
    String name;
    int quantity;

    // Constructor
    Item(String name, int quantity ) {
        this.name = name;
        this.quantity = quantity ;
    }

    // Method to display item
    void display() {
        System.out.println("Item: " + name + " | Quantity: " + quantity);
    }

    // Method to update quantity
    void updateQuantity(int q) {
        quantity = q;
    }
}

class Warehouse {
    public static void main(String[] args) {

        System.out.println("=== Warehouse Inventory System ===");

        // Create multiple items
        Item item1 = new Item("Apple", 10);
        Item item2 = new Item("Orange", 5);

        // Display all items
        System.out.println("\nInitial Inventory:");
        item1.display();
        item2.display();

        // Update quantities
        item1.updateQuantity(20);
        item2.updateQuantity(15);

        // Display updated items
        System.out.println("\nUpdated Inventory:");
        item1.display();
        item2.display();
    }
}