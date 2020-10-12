/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Andrew
 */
public class AccountService {

    public AccountService() {

    }

    public User login(String username, String password) {
        User user;
        if (username.equals("abe") || username.equals("barb") && password.equals("password")) {
            user = new User(username, null);
            return user;
        } else {
            return null;
        }
    }
}
