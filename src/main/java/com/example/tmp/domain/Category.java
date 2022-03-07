package com.example.tmp.domain;

import javax.persistence.*;



@Entity
@Table(name="Category")
public class Category {

    private enum productCategory{
        Electronics,
        Books,
        Consumables,
        Clothes,
        Other
    }



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private productCategory name;




    public Category() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public productCategory getName() {
        return name;
    }

    public void setName(productCategory name) {
        this.name = name;
    }
}
