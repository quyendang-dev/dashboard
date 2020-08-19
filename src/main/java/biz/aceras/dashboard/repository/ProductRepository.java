package biz.aceras.dashboard.repository;

import biz.aceras.dashboard.domain.Product;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
