/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

/**
 *
 * @author cancola
 */
public class User {
    public String userName;
    public String password;
    public String firstName;
    public String lastName;
    public String authToken;
    public int ID;
    
    public User(String user, String pass, String first, String last, String token, int id){
       userName = user;
       password = pass;
       firstName = first;
       lastName = last;
       authToken = token;
       ID = id;    
    }
    
}
