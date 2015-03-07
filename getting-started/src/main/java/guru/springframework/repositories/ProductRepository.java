package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 3/7/15.
 */
@Repository
public class ProductRepository {
    public Product getProduct(Long id){
        Product product = new Product();
        product.setDescription("Spring Guru In Action");
        return product;
    }
}
