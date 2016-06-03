package modele;

import mesActions.SuperAction;

/**
 * Created by khale on 23/05/2016.
 */
public class Armoire extends Product {
    public static String categorie = "armoire";

    //Il faut ajouter image mais je ne sais pas trop comment faire pour le moment !!

    public Armoire(){
        super();
        this.setCategory(categorie);
    }

}
