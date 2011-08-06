package com.tsumego.godClass;

import java.math.BigDecimal;

public class Item {

    private String name;

    private String description;

    private BigDecimal price;

    public Item(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
