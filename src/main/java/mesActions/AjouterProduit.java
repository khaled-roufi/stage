package mesActions;

/**
 * Created by khale on 18/05/2016.
 */
public class AjouterProduit extends SuperAction {
    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    private int idproduit;

public String execute() throws Exception{
    this.projectService.removeproduct(getIdproduit());
    return SUCCESS;
}
}
