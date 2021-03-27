package com.company;

import java.util.LinkedList;

public class ChatRoom {

    private int roomID;
    private String roomName;
    private String roomPassword;
    private LinkedList<User>  adduser;
    public String messages = " owner : Welcome To this room ";


    public ChatRoom(int roomID, String roomName, String roomPassword, LinkedList<User> adduser) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomPassword = roomPassword;
        this.adduser = adduser;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomPassword() {
        return roomPassword;
    }

    public void setRoomPassword(String roomPassword) {
        this.roomPassword = roomPassword;
    }

    public LinkedList<User> getAdduser() {
        return adduser;
    }

    public void setAdduser(LinkedList<User> adduser) {
        this.adduser = adduser;
    }

    public String getMessages() {
        return messages;
    }

    public void addMessages(String messages) {
        this.messages = this.messages + " \n " + messages;
    }
}
