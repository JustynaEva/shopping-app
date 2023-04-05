package com.shoppinglistsapp.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shopping_lists")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ShoppingList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;

//    @OneToMany(mappedBy = "shoppingList", cascade = CascadeType.ALL)
//    private List<Product> products = new ArrayList<>();
}
