package com.telusko.SpringEcom.Service;

import com.telusko.SpringEcom.Model.Product;
import com.telusko.SpringEcom.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {

        return productRepo.findById(id).orElse(new Product(-1));
    }
}
