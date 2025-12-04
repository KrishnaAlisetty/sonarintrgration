package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StockTest {

    @Test
    void test() {
        Stock stock = new Stock();
        Product product = new Product("toys");
        stock.setProductStock(Map.of(product, 5L));

        assertEquals(5L, stock.getProductStock().get(product));
        assertTrue(stock.getProductStock().keySet().contains(product));
    }
}