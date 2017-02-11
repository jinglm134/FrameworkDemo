package frameworkdemo.com.jlm.frameworkdemo.bean;

/**
 * UserBean
 * Created by jlm on 2016/10/25.
 */

public class UserBean {

    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserBean(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public UserBean() {
    }
}
