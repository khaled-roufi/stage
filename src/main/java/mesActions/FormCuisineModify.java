package mesActions;

import modele.Product;

/**
 * Created by khale on 22/05/2016.
 */
public class FormCuisineModify extends SuperAction {
    private int idproduit;
    private Product produit;

    public Product getProduit() {
        return produit;
    }

    public void setProduit(Product produit) {
        this.produit = produit;
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public String execute() throws Exception{
        produit = this.projectService.getProduitById(getIdproduit());
        if(produit!=null){
            return SUCCESS;
        }
        return INPUT;
    }
}
