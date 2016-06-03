package mesActions;

import modele.*;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by khale on 23/05/2016.
 */
public class ValiderProduit extends SuperAction implements ServletRequestAware {
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    private HttpServletRequest servletRequest;
    private String reference;
    private Double price;
    private Double taille;
    private String couleur;
    private String type;

    Product produit = new Product() ;

    public Product getProduit() {
        return produit;
    }

    public void setProduit(Product produit) {
        this.produit = produit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTaille() {
        return taille;
    }

    public void setTaille(Double taille) {
        this.taille = taille;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


    public File getUserImage() {
        return userImage;
    }

    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }

    public String getUserImageContentType() {
        return userImageContentType;
    }

    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }

    public String getUserImageFileName() {
        return userImageFileName;
    }

    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }

    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }

    public String execute() throws Exception {
        String verif = this.getType();
        if (verif == "lit") {
            produit = new Lit();
        }

        if (verif == "chevet") {
            produit = new Chevet();
        }

        if (verif == "commode") {
            produit = new Commode();
        }
        if (verif == "coiffeuse") {
            produit = new Coiffeuse();
        }

        if (verif == "armoire") {
            produit = new Armoire();
        }

        if (verif == "miroir") {
            produit = new Miroir();
        }

        if (verif == "pouffe") {
            produit = new Pouffe();
        }
        try {
            String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
            System.out.println("Image Location:" + filePath);//see the server console for actual location
            File fileToCreate = new File(filePath, this.userImageFileName);
            FileUtils.copyFile(this.userImage, fileToCreate);//copying image in the new file

            produit.setCategory(verif);
            produit.setReference(reference);
            produit.setPrice(price);
            produit.setCouleur(couleur);
            produit.setTaille(taille);
            produit.getImages().add(new Image(
                    userImageFileName));

            if ((produit.getPrice() != 0) && (!produit.getReference().equals("")) && (!produit.getCategory().equals("")) && (!produit.getCouleur().equals("")) && (produit.getTaille() != 0)) {
                this.projectService.addProduit(produit);
                return SUCCESS;
            }
            return INPUT;
        }catch (Exception e) {
            e.printStackTrace();
            addActionError(e.getMessage());

            return INPUT;
        }
    }


}
