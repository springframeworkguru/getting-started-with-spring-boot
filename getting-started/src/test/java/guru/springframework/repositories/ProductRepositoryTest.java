package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductRepositoryTest {
    @Test
    public void testGetProduct(){
        ProductRepositoryImpl repository = new ProductRepositoryImpl();
        Product product = repository.getProduct(1l);
        assertEquals(product.getDescription(), "Spring Guru In Action");
    }
}
