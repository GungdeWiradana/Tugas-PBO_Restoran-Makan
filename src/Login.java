public class Login {
    private String user;
    private String password_user;
    private String admin;
    private String password_admin;

    public Login() {
        this.user = "GungdeUser";
        this.password_user = "Gungde";
        this.admin = "GungdeAdmin";
        this.password_admin = "Gungde";
    }

    public Login(String user, String password_user, String admin, String password_admin) {
        this.user = user;
        this.password_user = password_user;
        this.admin = admin;
        this.password_admin = password_admin;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public void setPassword_admin(String password_admin) {
        this.password_admin = password_admin;
    }

    public String getUser() {
        return this.user;
    }

    public String getPassword_user() {
        return this.password_user;
    }

    public String getAdmin() {
        return this.admin;
    }

    public String getPassword_admin() {
        return this.password_admin;
    }
}
