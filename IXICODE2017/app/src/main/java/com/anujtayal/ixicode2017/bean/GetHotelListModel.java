package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class GetHotelListModel implements Serializable
{
    private ArrayList<HotelModel> hotel;

    public ArrayList<HotelModel> getHotel() {
        return hotel;
    }

    public void setHotel(ArrayList<HotelModel> hotel) {
        this.hotel = hotel;
    }
}
