package br.com.domain.repositories;

import br.com.domain.entities.Product;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public interface ProductRepository extends PanacheRepositoryBase<Product, UUID> {
}
