package org.code2java.repositories;

import org.code2java.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, String> {
}
