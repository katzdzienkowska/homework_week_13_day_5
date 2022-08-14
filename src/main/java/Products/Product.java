package Products;

import Behaviours.ISell;

public abstract class Product implements ISell {

    private String name;
    private double costPrice;
    private double retailPrice;

    public Product(String name, double costPrice, double retailPrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getName() {
        return name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public double calculateMarkup() {
        return this.getRetailPrice() - this.getCostPrice();
    }
}
