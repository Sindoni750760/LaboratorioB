package data;

import java.io.Serializable;

public abstract class Users implements Serializable {
    protected String username;
    protected String password;

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
}
