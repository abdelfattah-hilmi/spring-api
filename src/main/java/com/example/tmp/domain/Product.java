package com.example.tmp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
    @Id
    private long id;
    private String ref;
    private Double price;
    private Double category;
}
