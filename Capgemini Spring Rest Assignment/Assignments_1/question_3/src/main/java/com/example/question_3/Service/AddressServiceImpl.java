package com.example.question_3.Service;

import com.example.question_3.Model.Address;
import com.example.question_3.Model.AddressList;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AddressServiceImpl implements AddressService{


    AddressList addressList = new AddressList();
    Map<Integer,Address> addressMap = addressList.getAddressMap();
    @Override
    public String searchZipCode(int zipcode) {
        if(addressMap.containsKey(zipcode))
        {
            return addressMap.get(zipcode).toString().toUpperCase();
        }
        else
            return "there is no Address related to this zipcode";
    }
}
