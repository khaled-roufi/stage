package mesActions;

/**
 * Created by khale on 04/06/2016.
 */
public class SupprimerImage extends SuperAction {
    private String nomimage;

    public String getNomimage() {
        return nomimage;
    }

    public void setNomimage(String nomimage) {
        this.nomimage = nomimage;
    }

    public String execute() throws Exception{
        System.out.print("le nom de l'image : "+getNomimage());
        return SUCCESS;
    }
}
