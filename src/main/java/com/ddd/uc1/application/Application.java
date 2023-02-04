package com.ddd.uc1.application;

import com.ddd.uc1.domain.Cart;
import com.ddd.uc1.domain.Product;

import java.util.List;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product = new Product("Apple Pencil");
        cart.add(product);

        System.out.println("--------------------------------------------------------");
        System.out.println("Cart = " + cart);
        List<Product> products = cart.getProducts();
        System.out.println("--------------------------------------------------------");
        System.out.println("products = " + products);
    }
}
