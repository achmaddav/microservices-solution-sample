package com.rapidtech.productservice.controller;

import com.rapidtech.productservice.dto.ProductRequest;
import com.rapidtech.productservice.dto.ProductResponse;
import com.rapidtech.productservice.service.ProduckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProduckService produckService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  void createProduct(@RequestBody ProductRequest productRequest) {
        produckService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProduct() {
        return produckService.getAllProducts();
    }
}
