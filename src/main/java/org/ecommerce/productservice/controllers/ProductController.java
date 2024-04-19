package org.ecommerce.productservice.controllers;

import org.ecommerce.productservice.dtos.GetProductDto;
import org.ecommerce.productservice.exceptions.NotFoundException;
import org.ecommerce.productservice.models.Product;
import org.ecommerce.productservice.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    /*
    @GetMapping("/{id}/{temp}")
    public  String getProductById(@PathVariable("id") Long id, @PathVariable("temp")  String temp){
        return  "Here is the product "+id+" "+temp;
    }
    */
    private ProductService productService;
    private ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/{id}")
    public  @ResponseBody GetProductDto getProductDto(@PathVariable("id") Long id) throws Exception {
        return productService.getProductById(id);
    }

    @GetMapping("")
    public @ResponseBody List<GetProductDto> getAllProducts(){
        return productService.getAllProducts();
    }
    //    @RequestBody Product product -> Converts the received json to a Product java object

    @PostMapping("")
    public String createProduct(@RequestBody Product product)
    {
        System.out.println(product.getTitle());
        System.out.println(product.getPrice());
        return "product is created ";
    }

    // respoonse body
}
























