package mesActions;

import modele.Product;

import java.util.List;

/**
 * Created by khale on 24/05/2016.
 */
public class AfficherProduitsByCategory extends SuperAction {
    private String categorie;
    List<Product> AllProduits;

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public List<Product> getAllProduits() {
        return this.projectService.getAllProduitByCategory(getCategorie());
    }

    public void setAllProduits(List<Product> allProduits) {
        AllProduits = allProduits;
    }

    public String execute() throws Exception {
        if (!getAllProduits().isEmpty()) {
            return SUCCESS;
        }
        return INPUT;
    }
}
