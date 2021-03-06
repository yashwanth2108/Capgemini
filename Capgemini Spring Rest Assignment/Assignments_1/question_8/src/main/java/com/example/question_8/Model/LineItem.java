package com.example.question_8.Model;

public class LineItem {
    private int itemId;
    private int quantity;
    private Product product;

    public LineItem(int itemId, int quantity, Product product) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.product = product;
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
