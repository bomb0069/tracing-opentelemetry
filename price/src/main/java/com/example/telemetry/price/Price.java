package com.example.telemetry.price;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Price {

    @Id
    private long productId;
    private double priceAmount;
    private double discount;


    public Price() {
    }

    public Price(long productId, double priceAmount, double discount) {
        this.productId = productId;
        this.priceAmount = priceAmount;
        this.discount = discount;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public double getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(double priceAmount) {
        this.priceAmount = priceAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
}
