package br.com.application.mappers;

import br.com.application.dto.dto.product.EntityProductDTO;
import br.com.domain.entities.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ProductMapper {
    EntityProductDTO  toDTO(Product productId);
}
