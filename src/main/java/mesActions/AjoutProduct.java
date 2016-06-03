package mesActions;

import modele.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khale on 23/05/2016.
 */
public class AjoutProduct extends SuperAction {
    List<Product> AllLits = new ArrayList<Product>();
    List<Product> AllCommodes = new ArrayList<Product>();
    List<Product> AllArmoires = new ArrayList<Product>();
    List<Product> AllChevets = new ArrayList<Product>();
    List<Product> AllMiroirs = new ArrayList<Product>();
    List<Product> AllCoiffeuses = new ArrayList<Product>();
    List<Product> AllPouffes = new ArrayList<Product>();

    public List<Product> getAllLits() {
        return this.projectService.getAllProduitByCategory("lit");
    }

    public void setAllLits(List<Product> allLits) {
        AllLits = allLits;
    }

    public List<Product> getAllCommodes() {
        return  this.projectService.getAllProduitByCategory("commode");
    }

    public void setAllCommodes(List<Product> allCommodes) {
        AllCommodes = allCommodes;
    }

    public List<Product> getAllArmoires() {
        return  this.projectService.getAllProduitByCategory("armoire");
    }

    public void setAllArmoires(List<Product> allArmoires) {
        AllArmoires = allArmoires;
    }

    public List<Product> getAllChevets() {
        return  this.projectService.getAllProduitByCategory("chevet");
    }

    public void setAllChevets(List<Product> allChevets) {
        AllChevets = allChevets;
    }

    public List<Product> getAllMiroirs() {
        return  this.projectService.getAllProduitByCategory("miroir");
    }

    public void setAllMiroirs(List<Product> allMiroirs) {
        AllMiroirs = allMiroirs;
    }

    public List<Product> getAllCoiffeuses() {
        return  this.projectService.getAllProduitByCategory("coiffeuse");
    }

    public void setAllCoiffeuses(List<Product> allCoiffeuses) {
        AllCoiffeuses = allCoiffeuses;
    }

    public List<Product> getAllPouffes() {
        return  this.projectService.getAllProduitByCategory("pouffe");
    }

    public void setAllPouffes(List<Product> allPouffes) {
        AllPouffes = allPouffes;
    }
}
