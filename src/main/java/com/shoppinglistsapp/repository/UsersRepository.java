package com.shoppinglistsapp.repository;

import com.shoppinglistsapp.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
}
