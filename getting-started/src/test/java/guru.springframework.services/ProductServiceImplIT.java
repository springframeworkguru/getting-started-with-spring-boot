package guru.springframework.services;

import guru.springframework.domain.Product;
import guru.springframework.test.config.ProductServiceTestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ProductServiceTestConfig.class})
public class ProductServiceImplIT {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Test
    public void testGetProduct(){
        Product product = productService.getProduct(1L);
        assertEquals(product.getDescription(), "This is a test product");
    }
}
