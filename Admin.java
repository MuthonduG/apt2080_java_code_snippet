// Admin class extending Account
public class Admin extends Account {

    private String authPassword;

    public Admin(int id, String name, String password) {
        super(id, name);
        this.authPassword = password;
    }

    public String getAuthPassword() {
        return authPassword;
    }
}
