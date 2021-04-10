package com.example.question_3.Model;

import java.util.HashMap;
import java.util.Map;

public class AddressList {
    Map<Integer,Address> addressMap;

    public AddressList()
    {
        addressMap = new HashMap<>();
        addressMap.put(242001,new Address("Uttar Pradesh" , "Shahjahanpur" , "India"));
        addressMap.put(242003,new Address("Uttar Pradesh" , "Bareilly" , "India"));
        addressMap.put(242007,new Address("Uttar Pradesh" , "Badaun" , "India"));
        addressMap.put(242041,new Address("Uttar Pradesh" , "Lucknow" , "India"));
        addressMap.put(99501,new Address("AK" , "ANCHORAGE" , "US"));
    }

    public Map<Integer, Address> getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map<Integer, Address> addressMap) {
        this.addressMap = addressMap;
    }
}
