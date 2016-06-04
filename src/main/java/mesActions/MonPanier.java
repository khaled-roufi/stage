package mesActions;

import com.opensymphony.xwork2.ActionContext;
import modele.Product;
import modele.User;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by khale on 21/05/2016.
 */
public class MonPanier extends SuperAction implements SessionAware {
    Map<String, Object> session = ActionContext.getContext().getSession();
    List<Product> panier = new ArrayList<Product>();
    private User courant;

    public User getCourant() {
        return (User) session.get("current");
    }

    public void setCourant(User courant) {
        this.courant = courant;
    }

    public String execute() throws Exception{
        if(!getPanier().isEmpty()) {
            return SUCCESS;
        }
        return INPUT;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public List<Product> getPanier() {
        return getCourant().getPanier().getProductList();
    }

    public void setPanier(List<Product> panier) {
        this.panier = panier;
    }

    public void setSession(Map<String, Object> map) {
        this.session=map;
    }

    public Iterator getIterator(){
        return panier.iterator();
    }
}
