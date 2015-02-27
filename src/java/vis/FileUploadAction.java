/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vis;

import java.io.File;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;

public class FileUploadAction extends ActionSupport implements
        ServletRequestAware {

    private File userImage;
    private String userImageContentType;
    private String userImageFileName;

    private HttpServletRequest servletRequest;

    @Override
    public String execute() {
        try {
            String filePath = servletRequest.getSession().getServletContext().getRealPath("/").concat("userimages");

            System.out.println("Image Location:" + filePath);//see the server console for actual location  
            File fileToCreate = new File(filePath, this.userImageFileName);
            FileUtils.copyFile(this.userImage, fileToCreate);//copying image in the new file  
            return SUCCESS;
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
        finally
        {
            return SUCCESS;
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
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;

    }
}
