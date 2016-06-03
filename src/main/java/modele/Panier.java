package modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Panier {
    private List<Product> productList;
    private Date date ;
    private double price ;
    private String state ;

    public Panier() {
        this.setPrice(0);
        this.state = "EnCours";
        this.productList = new ArrayList<Product>();
    }

    /**
     *
     * @param productList
     * @param date
     * @param price
     * @param state
     */
    public Panier(List<Product> productList, Date date, double price, String state) {
        this.productList = productList;
        this.date = date;
        this.price = price;
        this.state = state;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
