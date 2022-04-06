package com.lambda;

public class Product {
    private String prod_name;
    private float price;
    private int prod_id;

    public Product(String prod_name, float price, int prod_id) {
        this.prod_name = prod_name;
        this.price = price;
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }
}



