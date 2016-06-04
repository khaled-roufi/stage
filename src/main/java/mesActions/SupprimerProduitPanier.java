package mesActions;

import com.opensymphony.xwork2.ActionContext;
import modele.Product;
import modele.User;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

/**
 * Created by khale on 21/05/2016.
 */
public class SupprimerProduitPanier extends SuperAction implements SessionAware {
    Map<String, Object> session = ActionContext.getContext().getSession();
    private int idproduit;
    private User courant = (User) this.session.get("current");


    public String execute() throws Exception {
        System.out.println("id produit :" + idproduit);


        List<Product> liste = courant.getPanier().getProductList();

        for (Product produit : liste) {

            if (produit.getId() == getIdproduit()) {

                    liste.remove(produit);

                courant.getPanier().setPrice(courant.getPanier().getPrice() - (produit.getPrice()*produit.getQuantity()));
                return SUCCESS;
            }
        }
        return INPUT;
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public User getCourant() {
        return courant;
    }

    public void setCourant(User courant) {
        this.courant = courant;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> map) {
        this.session = map;
    }

}
