package com.shoppinglistsapp.repository;

import com.shoppinglistsapp.model.entity.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListsRepository extends JpaRepository<ShoppingList,Integer> {
}
