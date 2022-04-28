package com.example.demo.repository;

import com.example.demo.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo {

    private static ArrayList<Product> products = new ArrayList<>();

    public List<Product> getAll() {
        return products;
    }

    public void save(Product p) {
        products.add(p);
    }

    // CRUD ..

}
