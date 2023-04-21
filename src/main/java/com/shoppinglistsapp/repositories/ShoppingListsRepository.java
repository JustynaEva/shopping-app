package com.shoppinglistsapp.repositories;

import com.shoppinglistsapp.model.entity.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface ShoppingListsRepository extends JpaRepository<ShoppingList,Integer> {

    Set<ShoppingList> findShoppingListsByUser_Id (Integer userId);
}
