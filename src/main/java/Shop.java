import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name, double till) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int getStockCount() {
        return this.getStock().size();
    }

    public double getTill() {
        return till;
    }

    public void addProductToStock(ISell product) {
        this.stock.add(product);
    }

    public void removeProductFromStock(ISell product) {
        this.stock.remove(product);
    }

    public double calculateProfit() {
        double totalProfit = 0;
        for (int i = 0; i < this.getStockCount(); i++){
            totalProfit += this.stock.get(i).calculateMarkup();
        }
        return totalProfit;
    }
}
