package com.telusko.SpringEcom.Repo;

import com.telusko.SpringEcom.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
