package mesActions;

import modele.Chambre;
import modele.Image;
import modele.Product;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.xml.sax.helpers.ParserFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by khale on 18/05/2016.
 */
public class ValiderChambre extends SuperAction implements ServletRequestAware {
    private int lit;
    private int commode;
    private int chevet;
    private int coiffeuse;
    private int armoire;
    private int miroir;
    private int pouffe;


    private String reference;
    private Double price;
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    private HttpServletRequest servletRequest;
    Chambre chambre = new Chambre();

    public File getUserImage() {
        return userImage;
    }

    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }

    public String getUserImageContentType() {
        return userImageContentType;
    }

    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }

    public String getUserImageFileName() {
        return userImageFileName;
    }

    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }

    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLit() {
        return lit;
    }

    public void setLit(int lit) {
        this.lit = lit;
    }

    public int getCommode() {
        return commode;
    }

    public void setCommode(int commode) {
        this.commode = commode;
    }

    public int getChevet() {
        return chevet;
    }

    public void setChevet(int chevet) {
        this.chevet = chevet;
    }

    public int getCoiffeuse() {
        return coiffeuse;
    }

    public void setCoiffeuse(int coiffeuse) {
        this.coiffeuse = coiffeuse;
    }

    public int getArmoire() {
        return armoire;
    }

    public void setArmoire(int armoire) {
        this.armoire = armoire;
    }

    public int getMiroir() {
        return miroir;
    }

    public void setMiroir(int miroir) {
        this.miroir = miroir;
    }

    public int getPouffe() {
        return pouffe;
    }

    public void setPouffe(int pouffe) {
        this.pouffe = pouffe;
    }

    public String execute() throws Exception {


     //   System.out.println("l'id du lit : " + getLit());

        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        //  System.out.println("Image Location:" + filePath);//see the server console for actual location
        File fileToCreate = new File(filePath, this.userImageFileName);
        FileUtils.copyFile(this.userImage, fileToCreate);//copying image in the new file

        chambre.setPrice(price);
        chambre.setReference(reference);
        chambre.setCategory("chambre");
        chambre.getImages().add(new Image(userImageFileName));
        if ((chambre.getPrice() != 0) && (!chambre.getReference().equals("")) && (!chambre.getCategory().equals(""))) {
            this.projectService.addProduit(chambre);
            this.projectService.addComposantChambre(this.projectService.getMaxIDProduct(), getLit());
            this.projectService.addComposantChambre(this.projectService.getMaxIDProduct(), getArmoire());
            this.projectService.addComposantChambre(this.projectService.getMaxIDProduct(), getChevet());
            this.projectService.addComposantChambre(this.projectService.getMaxIDProduct(), getCoiffeuse());
            this.projectService.addComposantChambre(this.projectService.getMaxIDProduct(), getCommode());
            this.projectService.addComposantChambre(this.projectService.getMaxIDProduct(), getMiroir());
            this.projectService.addComposantChambre(this.projectService.getMaxIDProduct(), getPouffe());

            return SUCCESS;
        }
        return INPUT;
    }
}
