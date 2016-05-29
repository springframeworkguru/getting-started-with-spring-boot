package guru.springframework.services;

import guru.springframework.domain.Product;

/**
 * Created by jt on 3/7/15.
 */
public interface ProductService {
     Product getProduct(Long id);
}
