package org.home.model;

import java.util.Objects;

public class Product {
    private int prodId;
    private String prodName;
    private int prodQuantity;

    public Product(int prodId, String prodName, int prodQuantity) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodQuantity = prodQuantity;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdQuantity() {
        return prodQuantity;
    }

    public void setProdQuantity(int prodQuantity) {
        this.prodQuantity = prodQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return prodId == product.prodId && prodQuantity == product.prodQuantity && Objects.equals(prodName, product.prodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId, prodName, prodQuantity);
    }

    @Override
    public String toString() {
        return "Product " +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodQuantity=" + prodQuantity +
                ;
    }
}
