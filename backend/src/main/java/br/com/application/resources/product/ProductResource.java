package br.com.application.resources.product;


import br.com.application.dto.dto.product.EntityProductDTO;
import br.com.application.services.product.ProductService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;

@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

    @Inject
    ProductService service;

    @GET
    @Path("/{product_id}")
    public Response getProductById(@PathParam("product_id") UUID product_id) {
        EntityProductDTO product = service.getProductById(product_id);
        return Response.status(Response.Status.OK).entity(product).build();
    }
}
