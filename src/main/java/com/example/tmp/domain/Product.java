package com.example.tmp.domain;

import javax.persistence.*;
// import com.example.tmp.domain.Category;

@Entity
@Table(name="Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String ref;
    private Double price;

    @ManyToOne
    //@JoinColumn(name = "id" , insertable = false, updatable = false)
    private Category category;

    public Product() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}