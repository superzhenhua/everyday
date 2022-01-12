package day11;

import java.io.Serializable;

public class user implements Serializable {
   private String username ;
   private String password;

    public user() {
    }

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
