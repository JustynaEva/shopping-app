package com.shoppinglistsapp.repository;

import com.shoppinglistsapp.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Integer> {
}
