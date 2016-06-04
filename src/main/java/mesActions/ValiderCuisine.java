package mesActions;

import modele.Cuisine;
import modele.Image;
import modele.Product;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by khale on 18/05/2016.
 */
public class ValiderCuisine extends SuperAction implements ServletRequestAware {
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    private HttpServletRequest servletRequest;
    private String reference;
    private Double price;
    Cuisine cui= new Cuisine();

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

    public void setPrice(Double price) {
        this.price = price;
    }

    public Cuisine getCui() {
        return cui;
    }

    public void setCui(Cuisine cui) {
        this.cui = cui;
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



    public String execute() throws Exception{
        try {
            String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
          //  System.out.println("Image Location:" + filePath);//see the server console for actual location
            File fileToCreate = new File(filePath, this.userImageFileName);
            FileUtils.copyFile(this.userImage, fileToCreate);//copying image in the new file
            cui.setPrice(getPrice());
            cui.setReference(reference);
            cui.setCategory("cuisine");
            Image image = new Image(userImageFileName,true);
            cui.getImages().add(new Image(userImageFileName));
            System.out.println(image.getId());
            System.out.println(image.getFile());
            if ((cui.getPrice()!=0)&&(!cui.getReference().equals(""))&&(!cui.getCategory().equals(""))) {
                this.projectService.addProduit(cui);
                System.out.println("Le max : "+this.projectService.getMaxIDProduct());
                this.projectService.addImageBDD(this.projectService.getMaxIDProduct(),image);
                return SUCCESS;
            }
            return INPUT;
        } catch (Exception e) {
            e.printStackTrace();
            addActionError(e.getMessage());

            return INPUT;
        }
    }
}
