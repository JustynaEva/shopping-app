package com.shoppinglistsapp.repositories;

import com.shoppinglistsapp.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductsRepository extends JpaRepository<Product,Integer> {
    List<Product> findProductsByShoppingList_Id (Integer shoppingListId);
}
