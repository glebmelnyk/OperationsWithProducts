package org.home.details;

import org.home.model.Product;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Product> getData() {
        ArrayList<Product>productList=new ArrayList<>();

        Product zapalniczka = new Product(13, "Lighter", 187);
        Product molot = new Product(87,"Molot", 31);
        Product serp = new Product(17, "Serp", 7);
        Product shopper = new Product(3, "Shopper", 89);
        Product pants = new Product(78,"Pants", 9);
        Product pistol = new Product(5,"Glock-18", 700);
        Product rower = new Product(14, "RowerGravel", 1);
        Product rowerFix = new Product(2, "Fix", 54);
        Product hoodie = new Product(24,"Hoodie", 9);
        Product ak47 = new Product(47,"AK-47", 1000);

        productList.add(zapalniczka);
        productList.add(molot);
        productList.add(serp);
        productList.add(shopper);
        productList.add(pants);
        productList.add(pistol);
        productList.add(rower);
        productList.add(rowerFix);
        productList.add(hoodie);
        productList.add(ak47);

        return productList;
    }
}
