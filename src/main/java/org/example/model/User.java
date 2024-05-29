package org.example.model;

public abstract class User extends BaseEntity {
    protected String name;
    protected String UserName;
    protected String password;
    protected String email;
    protected String token;

    public User( String name, String userName, String password, String email) {

        this.name = name;
        UserName = userName;
        this.password = password;
        this.email = email;
        this.token = "secure token = { " +userName + ", " + password + ", " + email + " }";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}

