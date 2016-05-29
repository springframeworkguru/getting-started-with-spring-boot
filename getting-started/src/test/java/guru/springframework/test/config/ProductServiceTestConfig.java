package guru.springframework.test.config;

import guru.springframework.repositories.ProductRepository;
import guru.springframework.repositories.ProductRepositoryTestStub;
import guru.springframework.services.ProductService;
import guru.springframework.services.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductServiceTestConfig {
    @Bean
    ProductRepository productRepository(){
        return new ProductRepositoryTestStub();
    }

    @Bean
    ProductService productService(){
        return new ProductServiceImpl();
    }
}
