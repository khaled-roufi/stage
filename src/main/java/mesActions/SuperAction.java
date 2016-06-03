package mesActions;

import Services.ProjectBdd;
import Services.ProjectService;
import com.opensymphony.xwork2.ActionSupport;
import modele.User;

/**
 * Created by khale on 16/05/2016.
 */
public class SuperAction extends ActionSupport {

    public ProjectService projectService = new ProjectBdd();
    public static User courant = null ;

}
