package pe.joedayz.ws.products.service;

import pe.joedayz.ws.products.rest.CreateProductRestModel;

/**
 * @author josediaz
 **/
public interface ProductService {
    String createProduct(CreateProductRestModel createProductRestModel) throws Exception;
}
