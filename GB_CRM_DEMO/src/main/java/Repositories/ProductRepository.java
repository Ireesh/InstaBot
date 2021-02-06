package Repositories;

import Entity.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findProductByName(String name);
}
