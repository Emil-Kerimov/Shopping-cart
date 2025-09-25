package org.example.shoppingcart.controller;

import lombok.RequiredArgsConstructor;
import org.example.shoppingcart.models.Product;
import org.example.shoppingcart.response.ApiResponse;
import org.example.shoppingcart.service.product.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/products")
public class ProductController {
    private final IProductService productService;

    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(new ApiResponse("success", products));
    }
}