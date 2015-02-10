/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vis;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author vishnu-pt517
 */
public class Login extends ActionSupport {

    private final static long serialVersionUID = 1L;
    private String uname, pass;

    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String execute() {
        System.out.println("Got " + uname + "--" + pass);
        if (uname.equals(pass)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

}
