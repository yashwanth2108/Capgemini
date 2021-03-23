package com.company;

public class Shop_Storage {
    String desertItem;
    int price;

    public Shop_Storage(String desertItem,int price) {
        this.desertItem = desertItem;
        this.price = price;
    }

    public String getDesertItem() {
        return desertItem;
    }

    public void setDesertItem(String desertItem) {
        this.desertItem = desertItem;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
