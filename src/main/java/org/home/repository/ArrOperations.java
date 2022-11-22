package org.home.repository;

import org.home.model.Product;

import java.util.ArrayList;

public interface ArrOperations {
    ArrayList<Product> delitingProd(ArrayList<Product> productsList, int prodId);

    Product finderById(ArrayList<Product> productsList, int prodId);
}
