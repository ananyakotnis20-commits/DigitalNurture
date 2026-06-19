public class InventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();


        inventory.addProduct(new Product(101, "Laptop", 50, 55000.0));
        inventory.addProduct(new Product(102, "Mouse", 200, 500.0));
        inventory.addProduct(new Product(103, "Keyboard", 150, 1200.0));

        inventory.displayAll();

        inventory.updateProduct(102, 180, 450.0);
        inventory.searchProduct(103);
        inventory.deleteProduct(101);

        inventory.displayAll();
    }
}
