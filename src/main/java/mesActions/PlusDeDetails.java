package mesActions;

import modele.Image;
import modele.Product;

import java.util.List;

/**
 * Created by khale on 30/05/2016.
 */
public class PlusDeDetails extends SuperAction {
    private int idproduit;
    private Product produit ;


    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }


    public Product getProduit() {
        return produit;
    }

    public void setProduit(Product produit) {
        this.produit = produit;
    }

    public String execute() throws Exception{

        List<Image> maliste = this.projectService.getListeImages(getIdproduit());
       // System.out.println("le nombre de photo de ce produit est :"+maliste.size());
        produit = this.projectService.getProduitById(getIdproduit());
        produit.setImages(maliste);
       /* for(Image img : produit.getImages()){
            System.out.println("lister les noms photos : " +img.getFile());
        }*/
        if(!maliste.isEmpty()){
            return SUCCESS;
        }
        return INPUT;
    }
}
