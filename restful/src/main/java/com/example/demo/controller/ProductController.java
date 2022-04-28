package com.example.demo.controller;

import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;
import com.example.demo.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Stack;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{a}/{b}/{c}/{d}")
    public void test(@PathVariable String a,
                     @PathVariable String b,
                     @PathVariable String c,
                     @PathVariable String d) {

    }


    @GetMapping("/{a}/{b}/{c}/{d}")
    public void test2(Map<String, String> params) {
        params.get("b");
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.status(403).body(productService.getAll());
        // return productService.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        //
        return null;
    }

    @GetMapping(value = "api/v2/products")
    public Product getByIdv2(@RequestParam int id) {
        return null;
    }

    // /products/5 DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {

    }

    @PutMapping("/{id}")
    public void update(@RequestBody Product p, @PathVariable int id) {

    }

    @PostMapping
    public void saveProduct(@RequestBody Product p) {
        //
    }


}
