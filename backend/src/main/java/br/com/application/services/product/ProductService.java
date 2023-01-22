package br.com.application.services.product;


import br.com.application.dto.dto.product.EntityProductDTO;

import java.util.UUID;

public interface ProductService {

    EntityProductDTO getProductById(UUID productId);
}
