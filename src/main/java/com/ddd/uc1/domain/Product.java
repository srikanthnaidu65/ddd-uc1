package com.ddd.uc1.domain;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
