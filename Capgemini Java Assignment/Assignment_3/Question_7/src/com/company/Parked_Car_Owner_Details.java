package com.company;

public class Parked_Car_Owner_Details {
    String ownerName;
    String carModel;
    int carNo;
    long ownerMobileNo;
    String ownerAddress;
    String carLoc;
    int Token;

    public String getCarLoc() {
        return carLoc;
    }

    public void setCarLoc(String carLoc) {
        this.carLoc = carLoc;
    }

    public Parked_Car_Owner_Details(String ownerName, String carModel, int carNo, long ownerMobileNo, String ownerAddress) {
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.carNo = carNo;
        this.ownerMobileNo = ownerMobileNo;
        this.ownerAddress = ownerAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public long getOwnerMobileNo() {
        return ownerMobileNo;
    }

    public void setOwnerMobileNo(long ownerMobileNo) {
        this.ownerMobileNo = ownerMobileNo;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public int getToken() {
        return Token;
    }

    public void setToken(int token) {
        Token = token;
    }
}
