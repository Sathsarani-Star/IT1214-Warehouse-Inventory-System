import java.util.ArrayList;

class Inventory {
    ArrayList<Item> items = new ArrayList<>();

    void addItem(String name, int quantity) {
        items.add(new Item(name, quantity));
        System.out.println("Item added!");
    }

    void viewItems() {
        if (items.isEmpty()) {
            System.out.println("No items in inventory.");
        } else {
            System.out.println("\nItems List:");
            for (Item item : items) {
                System.out.println("Name: " + item.name + ", Quantity: " + item.quantity);
            }
        }
    }

    void updateItem(String name, int quantity) {
        boolean found = false;

        for (Item item : items) {
            if (item.name.equalsIgnoreCase(name)) {
                item.quantity = quantity;
                System.out.println("Updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found!");
        }
    }
}