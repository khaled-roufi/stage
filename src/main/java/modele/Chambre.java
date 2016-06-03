package modele;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khale on 14/05/2016.
 */
public class Chambre extends  Product{

    private List<Product> composants;
    public static String categorie = "chambre";


    public Chambre(){
        super();
        this.setCategory(categorie);
    }

    public Chambre(List<Product> composants) {
        super();
        this.setCategory(categorie);
        this.composants = new ArrayList<Product>();
    }

    public List<Product> getComposants() {
        return composants;
    }

    public void setComposants(List<Product> composants) {
        this.composants = composants;
    }
}
