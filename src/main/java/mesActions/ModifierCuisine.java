package mesActions;

import modele.Cuisine;
import modele.Product;

/**
 * Created by khale on 22/05/2016.
 */
public class ModifierCuisine extends SuperAction {
    private int idproduit;
    private String reference;
    private String price;

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String execute() throws Exception {
        Product cui = new Cuisine();

        cui.setReference(reference);
        cui.setPrice(Double.parseDouble(price));
        this.projectService.updateproduit(getIdproduit(), cui);
        return SUCCESS;
    }
}
