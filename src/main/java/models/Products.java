package models;

public class Products {
    private String productName;
    private double unitPrice;
    private int stock;
    private String category;
    private String stockStatus;

    public Products(){

    }

    public Products(String items, double unitPrice, int stock, String Category, String stockStatus) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stock=stock;
        this.category= Category;
        this.stockStatus= stock>0? "IN STOCK": "OUT OF STOCK";

    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setProductName(String items) {
        this.productName = productName;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }
    public String setStock(int stock){
        this.stock=stock;
        return "";
    }
    public String getCategory(){
        return category;
    }

    public String setCategory(String category){
        this.category= category;
        return category;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public void reduceStock(int quantity){
        if (quantity <= stock){
            stock -= quantity;
            if (stock==0){
                stockStatus="OUT OF STOCK";
            }
        }
    }

    public void add(Products products) {
    }
}

