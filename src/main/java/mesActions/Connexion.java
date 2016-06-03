package mesActions;

import modele.Panier;
import modele.User;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by khale on 17/05/2016.
 */
public class Connexion extends SuperAction implements SessionAware{
    private Map session;
    private String login;
    private String password;
    private User courant;

    public User getCourant() {
        return courant;
    }

    public void setCourant(User courant) {
        this.courant = courant;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public String execute()throws Exception{

        courant = this.projectService.userIn(getLogin(),getPassword());
        session.put("current", courant);


        if(courant!=null){
            Panier panier = new Panier();
            courant.setPanier(panier);
            return SUCCESS;
        }else{
            validateX();
        }
        return INPUT;
    }

    public void validateX() {
        this.addFieldError("username" , "Le mec nexiste pas");
        super.validate();
    }

}
