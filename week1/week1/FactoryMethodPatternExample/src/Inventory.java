import java.util.HashMap;
import java.util.Map;
public class Inventory {

    private Map<Integer,Product> products=new HashMap<>();

    public void addProduct(Product product){
        products.put(product.getProductId(),product);
        System.out.println("ADDED:: "+product);

    }
    public void deleteProduct(int productId){
        if(products.remove(productId)!=null){
            System.out.println("Deleted product with ID: " + productId);

        }else{
            System.out.println("Product ID " + productId + " not found!");
        }
    }
    public void updateProduct(int productId,int newQuant,double newPrice){
        Product product=products.get(productId);
        if(product!=null){
            product.setPrice(newPrice);
            product.setQuantity(newQuant);
            System.out.println("Updated: " + product);
        }
        else {
            System.out.println("Product ID " + productId + " not found!");
        }

    }
    public void searchProduct(int productId){
        Product product=products.get(productId);
        System.out.println(product != null ? "Found: " + product
                : "Product ID " + productId + " not found!");
    }
    public void displayAll() {
        System.out.println("\n--- Current Inventory ---");
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}
