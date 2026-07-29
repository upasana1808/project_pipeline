package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dto.ProductDTO;
import com.example.exception.ProductNotFoundException;
import com.example.model.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public int save(ProductDTO dto) {

        Product product = new Product();

        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setQuantity(dto.getQuantity());

        return repository.save(product);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    // 
    public Product findById(int id) {

    Product product = repository.findById(id);

    if(product == null) {
        throw new ProductNotFoundException(
                "Product with ID " + id + " not found");
    }

    return product;
}

    public int update(Product product) {
        return repository.update(product);
    }

    public int delete(int id) {
        return repository.delete(id);
    }
}


// package com.example.service;

// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.example.model.Product;
// import com.example.repository.ProductRepository;

// @Service
// public class ProductService {

//     private ProductRepository repository;

//     public ProductService(ProductRepository repository) {
//         this.repository = repository;
//     }

//     public int save(Product p){
//         return repository.save(p);
//     }

//     public List<Product> findAll(){
//         return repository.findAll();
//     }

//     public Product findById(int id){
//         return repository.findById(id);
//     }

//     public int update(Product p){
//         return repository.update(p);
//     }

//     public int delete(int id){
//         return repository.delete(id);
//     }

// }