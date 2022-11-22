package org.home.repository.implementation;

import org.home.model.Product;
import org.home.repository.ArrOperations;

import java.util.ArrayList;

public class OperationsImplementation implements ArrOperations {
    @Override
    public ArrayList<Product> delitingProd(ArrayList<Product> productsList, int prodId) {
        for(Product product: productsList){
            if(product.getProdId() ==prodId){
                productsList.remove(product);
            }
        }
        return productsList;
    }

    @Override
    public Product finderById(ArrayList<Product> productsList, int prodId) {
         for(Product product: productsList){
             if(product.getProdId()==prodId){
                 System.out.println(product.getProdId());
             }
         }
        return product;
    }
}
