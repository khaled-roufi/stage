package mesActions;

import modele.Cuisine;

import java.util.List;

/**
 * Created by khale on 22/05/2016.
 */
public class ListeModifyCuisine extends SuperAction {
    List<Cuisine> AllCuisines;
    Cuisine cui = new Cuisine();
    public List<Cuisine> getAllCuisines() {
        return this.projectService.getAllCuisines();
    }

    public void setAllCuisines(List<Cuisine> allCuisines) {
        AllCuisines = allCuisines;
    }

    public String execute() throws Exception {

        return SUCCESS;
    }
}
