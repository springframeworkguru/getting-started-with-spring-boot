package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public Product getProduct(Long id){
        Product product = new Product();
        product.setDescription("Spring Guru In Action");
        return product;
    }
}
