package com.shoppinglistsapp.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String username;
    private String password;
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<ShoppingList> shoppingLists = new ArrayList<>();
}
