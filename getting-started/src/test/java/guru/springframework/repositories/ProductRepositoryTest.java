package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jt on 3/17/15.
 */
public class ProductRepositoryTest {
    @Test
    public void testGetProduct(){
        ProductRepository repository = new ProductRepository();
        Product product = repository.getProduct(1l);
        assertEquals(product.getDescription(), "Spring Guru In Action");
    }
}
