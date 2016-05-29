package guru.springframework.repositories;

import guru.springframework.domain.Product;

public interface ProductRepository {
    Product getProduct(Long id);
}
