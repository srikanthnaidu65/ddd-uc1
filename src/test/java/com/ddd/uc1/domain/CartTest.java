package com.ddd.uc1.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author srikanth
 * @since 04/02/2023
 */
class CartTest {

    @Test
    void shouldAddProductToCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product");
        cart.add(product);

        List<Product> actual = cart.getProducts();

        assertEquals(1, actual.size());
        assertEquals("Some test product", actual.get(0).getName());
    }
}
