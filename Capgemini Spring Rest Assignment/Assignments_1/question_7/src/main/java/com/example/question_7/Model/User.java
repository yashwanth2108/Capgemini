package com.example.question_7.Model;

public class User {

    private String userName;
    private String userNumber;
    private String userAddress;
    private int userId;

    User()
    {

    }

    public User(String userName, String userNumber, String userAddress, int userId) {
        this.userName = userName;
        this.userNumber = userNumber;
        this.userAddress = userAddress;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
