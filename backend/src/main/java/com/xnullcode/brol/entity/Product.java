package com.xnullcode.brol.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="products")
public class Product{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Double price;
    private String name;
    private Integer stockQuantity;

    public Product() {}
    public Product(String name,Double price,Integer stockQuantity){
        this.name=name;
        this.price=price;
        this.stockQuantity=stockQuantity;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(Double price){
        this.price=price;
    }
    public void setStockQuantity(Integer stockQuantity){
        this.stockQuantity=stockQuantity;
    }
    public String getName(){
        return name;
    }
    public Long getId(){
        return id;
    }
    public Double getPrice(){
        return price;
    }
    public Integer getStockQuantity(){
        return stockQuantity;
    }
}
