package mesActions;

import com.opensymphony.xwork2.ActionContext;
import modele.Product;
import modele.User;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by khale on 18/05/2016.
 */
public class AjouterPanier extends SuperAction implements SessionAware {
    private int idproduit;
    private Product produit = new Product();
    private User courant;
    Map<String, Object> session = ActionContext.getContext().getSession();

    public User getCourant() {
        return courant;
    }

    public void setCourant(User courant) {
        this.courant = courant;
    }

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

    public String execute() throws Exception {

        produit = this.projectService.getProduitById(getIdproduit());

        if (produit != null) {

            courant = (User) session.get("current");

            if (this.projectService.productIn(produit, courant.getPanier().getProductList())) {
                System.out.println("il est la!!");
                List<Product> Liste = courant.getPanier().getProductList();
                for (Product p : Liste) {
                    if (p.getId() == produit.getId()) {
                        p.setQuantity(p.getQuantity() + 1);
                    }
                    courant.getPanier().setProductList(Liste);
                }
                courant.getPanier().setPrice(courant.getPanier().getPrice() + produit.getPrice());
                return SUCCESS;
            } else {
                produit.setQuantity(produit.getQuantity() + 1);
                courant.getPanier().getProductList().add(produit);
                courant.getPanier().setPrice(courant.getPanier().getPrice() + produit.getPrice());
                return SUCCESS;
            }
        }
        return SUCCESS;
    }

    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
