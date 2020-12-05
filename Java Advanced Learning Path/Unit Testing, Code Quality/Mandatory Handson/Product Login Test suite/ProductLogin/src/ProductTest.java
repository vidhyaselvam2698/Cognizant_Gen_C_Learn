import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductTest {
    @Test
    public void deleteproduct() {
        Product product = new Product("105", "Shimano 105 Derailleur", 10000.00);
        Product product1 = new Product("4900", "Zephyrus G14", 100000.00);
        Product product2 = new Product();
        Product product3 = new Product();
        ProductDAO productDAO = new ProductDAO();

        // ProductDAO.addProduct(Product product) test
        assertTrue(productDAO.addProduct(product));
        assertTrue(productDAO.addProduct(product1));
        assertTrue(productDAO.addProduct(product2));
        assertFalse(productDAO.addProduct(null));

        product.setPrice(15000.00);

        // ProductDAO.deleteProduct(Product product) test
        assertTrue(productDAO.deleteProduct(product));
        assertTrue(productDAO.deleteProduct(product1));
        assertTrue(productDAO.deleteProduct(product2));
        assertFalse(productDAO.deleteProduct(product3));
        assertFalse(productDAO.deleteProduct(null));
    }
}
