/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xhesina Ismaili
 */
import java.io.*;
public abstract class User implements Payable, Serializable{
    private int userId;
    private String username;
    private String password;
    private String address;
    private int phonenumber;

    public User(int userId, String username, String password, String address, int phonenumber) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phonenumber = phonenumber;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String printInfo() {
        return String.format("Id:%d\n Username:%s\n Address:%s\n Phone:%d\n", getUserId(), getUsername(), getAddress(), getPhonenumber());
    }
    
    public double calculateBonus()
    {
        return 0;
    }
}
