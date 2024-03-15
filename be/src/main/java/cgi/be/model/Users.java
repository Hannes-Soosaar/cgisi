package cgi.be.model;

public class Users {
    private Long id;
    private String userName;
    private String email;
    private String credentials;
    private boolean admin;
    private boolean active;

    public Users() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getActive() {
        return active;
    }

//    This section is done with the help of GPT
    @Override
    public String toString(){
        return "User { " +"id= " +id+ ", user name= "+ userName+", email = "+email+ ", is admin = "+ admin +",is active= "+active+" }";
    }
}