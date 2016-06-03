package mesActions;

import com.opensymphony.xwork2.ActionContext;
import modele.User;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by khale on 24/05/2016.
 */
public class ValiderPanier extends SuperAction implements SessionAware{
    Map<String, Object> session = ActionContext.getContext().getSession();
    private User courant;

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
        this.session=map;
    }

    public String execute() throws Exception{
        courant = (User) session.get("current");
        this.projectService.validerpanier(courant);
        this.projectService.validercomposantscommande(courant);
        return SUCCESS;
    }
}
