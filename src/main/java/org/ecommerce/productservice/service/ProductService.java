package org.ecommerce.productservice.service;

import org.ecommerce.productservice.dtos.GetProductDto;
import org.ecommerce.productservice.exceptions.NotFoundException;
import org.ecommerce.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {


    public GetProductDto getProductById(Long id) throws NotFoundException {

        RestTemplate restTemplate=new RestTemplate();
        String url="https://fakestoreapi.com/products/"+id;
        Product product= restTemplate.getForObject(url,Product.class);
        System.out.println(product);

        if(product==null){
            throw new NotFoundException();
        }

        return convertToDto(product);
    }

    private static GetProductDto convertToDto(Product product) {
        GetProductDto getProductDto = new GetProductDto();
        getProductDto.setName(product.getTitle());
        getProductDto.setPrice(product.getPrice());
        getProductDto.setImageUrl(product.getImage());
        return getProductDto;
    }

    public List<GetProductDto> getAllProducts(){
        RestTemplate restTemplate=new RestTemplate();
        String url="https://fakestoreapi.com/products";
        Product  products[]= restTemplate.getForObject(url,Product[].class);
        List<GetProductDto> returnProducts=new ArrayList<>();
        for(Product product:products){
            returnProducts.add(convertToDto( product));
        }
        return returnProducts;
    }
}
