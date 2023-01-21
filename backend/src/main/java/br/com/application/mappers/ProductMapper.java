package br.com.application.mappers;

import br.com.application.dto.product.AddProductDTO;
import br.com.domain.entities.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ProductMapper {

    Product toAddProductDTO(AddProductDTO dto);
}
