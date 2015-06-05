package guru.springframework.services;


import guru.springframework.domain.Product;
import guru.springframework.repositories.ProductRepositoryTestStub;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductServiceImplTest {

    private ProductServiceImpl productService;

    @Before
    public void setup(){
        productService = new ProductServiceImpl();
        productService.setProductRepository(new ProductRepositoryTestStub());
    }

    @Test
    public void testGetProduct(){
        Product product = productService.getProduct(23L);
        assertEquals(product.getDescription(), "This is a test product");
    }
}
