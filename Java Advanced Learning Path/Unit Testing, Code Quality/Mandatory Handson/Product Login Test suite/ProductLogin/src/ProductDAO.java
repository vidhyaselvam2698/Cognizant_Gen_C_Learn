import java.util.ArrayList;

public class ProductDAO {
    ArrayList<Product> productList = new ArrayList<>();

    public boolean addProduct(Product product) {
        if (product != null) {
            return productList.add(product);
        }

        return false;
    }

    public boolean deleteProduct(Product product) {
        if (product != null) {
            return productList.remove(product);
        }

        return false;
    }
}
