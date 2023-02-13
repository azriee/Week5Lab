/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import models.User;

/**
 *
 * @author azriee
 */
public class AccountService {
    ArrayList<User> users = new ArrayList<User>();

    public AccountService() {
    users.add(new User("abe","password"));
    users.add(new User("barb","password"));
    }
    
    public User login(String username, String password){
        for (User user:users){
            if(user.getPassword().equals(password) && user.getUsername().equals(username)){
                return new User(user.getUsername());
            }
        }
        return null;
    }
}
