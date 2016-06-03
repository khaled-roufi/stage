package Services;

import modele.*;

import java.util.List;

/**
 * Created by khale on 16/05/2016.
 */
public interface ProjectService {
    void register(User user);
    User userIn(String login, String password);
    boolean productIn(Product produit,List<Product> list);
    void addnewphoto(Product produit);
    void addProduit(Product produit);
    void removeproduct(int idproduit);
    void updateproduit(int idproduit,Product produit);
    List<Product> getAllProduitByCategory(String categorie);
    List<Cuisine> getAllCuisines();
    void validerpanier(User u);
    void validercomposantscommande(User u);
    Product getProduitById(int id);
    int getIdCommande(Long iduser);
    void addImageBDD(int MaxId,String NomImage );
    void addComposantChambre(int MaxId,int idproduit);
    int getMaxIDProduct();
    List<Image> getListeImages(int idproduit);
}
