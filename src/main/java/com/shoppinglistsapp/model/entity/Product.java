package com.shoppinglistsapp.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@Table(name = "products")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer quantity;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isBought;

//    @ManyToOne
//    @JoinColumn(name = "shopping_list_id")
//    private ShoppingList shoppingList;



}
