package mesActions;

/**
 * Created by khale on 22/05/2016.
 */
public class RemoveProduit extends SuperAction {
private int idproduit;

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public String execute() throws Exception{
    this.projectService.removeproduct(getIdproduit());
        return SUCCESS;
}


}
