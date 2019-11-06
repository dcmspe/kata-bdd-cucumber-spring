package pt.tabajara_airflights.models;

import lombok.Getter;
import lombok.Setter;

public class User{

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Getter @Setter
    private String username;

    @Getter @Setter
    private String password;
}
