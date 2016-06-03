package modele;


import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private double price;
    private int quantity;
    private List<Image> images = new ArrayList<Image>();
    private String reference;
    private String category;
    private double taille;
    private String couleur;

    public Product() {
    }

    public Product(double price, int quantity, String reference, String category, String couleur, Double taille) {
        this.price = price;
        this.quantity = quantity;
        this.reference = reference;
        this.category = category;
        this.taille = taille;
        this.couleur = couleur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getImagePrincipal() {
        return images.get(0).getFile();
    }
}