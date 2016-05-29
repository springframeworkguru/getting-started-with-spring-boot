package guru.springframework.repositories;

import guru.springframework.domain.Product;

public class ProductRepositoryTestStub implements ProductRepository {
    @Override
    public Product getProduct(Long id) {
        Product product = new Product();
        product.setDescription("This is a test product");
        return product;
    }
}
