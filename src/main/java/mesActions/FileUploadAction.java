package mesActions;

import java.io.IOException;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by khale on 20/05/2016.
 */
public class FileUploadAction extends SuperAction implements ServletRequestAware {

    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
    private HttpServletRequest servletRequest;

    public String execute() throws IOException {
        try {
            String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
            System.out.println("Image Location:" + filePath);//see the server console for actual location
            File fileToCreate = new File(filePath, this.userImageFileName);
            FileUtils.copyFile(this.userImage, fileToCreate);//copying image in the new file

            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            addActionError(e.getMessage());

            return INPUT;
        }
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
        System.out.println("CALLING IT WITH " + userImageFileName);

    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;

    }
}
