package com.anmol.simpleWebApp.service;

import com.anmol.simpleWebApp.model.Product;
import com.anmol.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "IPhone", 50000),
//            new Product(102, "LG TV", 100000),
//            new Product(103, "PS5", 50000),
//            new Product(104, "MSI Monitor", 25000),
//            new Product(105, "Razor Mouse", 2500)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product(100, "Nothing found", 0));
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProoduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
