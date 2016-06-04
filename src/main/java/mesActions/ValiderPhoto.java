package mesActions;

import modele.Image;
import modele.Product;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by khale on 30/05/2016.
 */
public class ValiderPhoto extends SuperAction implements ServletRequestAware{
    private int idproduit;
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    private HttpServletRequest servletRequest;


    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

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

    public String execute() throws Exception{
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        File fileToCreate = new File(filePath, this.userImageFileName);
        FileUtils.copyFile(this.userImage, fileToCreate);//copying image in the new file

        Product p = this.projectService.getProduitById(getIdproduit());
        Image img = new Image(userImageFileName,false);
        p.getImages().add(img);
        this.projectService.addnewphoto(p);
        return SUCCESS;
    }
}
