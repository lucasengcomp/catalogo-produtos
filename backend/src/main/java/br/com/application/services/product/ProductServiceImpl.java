package br.com.application.services.product;

import br.com.application.dto.dto.product.EntityProductDTO;
import br.com.application.mappers.ProductMapper;
import br.com.domain.entities.Product;
import br.com.domain.infra.data.ProductRepositoryImpl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class ProductServiceImpl implements ProductService {

    @Inject
    ProductRepositoryImpl repository;

    @Inject
    ProductMapper mapper;

    @Override
    @Transactional
    public EntityProductDTO getProductById(UUID productId) {
        Product byId = searchProductById(productId);
        return mapper.toDTO(byId);
    }

    private Product searchProductById(UUID productId) {
        Optional<Product> productFound = repository.findByIdOptional(productId);
        if (productFound.isEmpty()) {
            throw new NotFoundException("Product not found!");
        }
        return productFound.get();
    }
}
