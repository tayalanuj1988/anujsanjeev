package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class GetHotelData implements Serializable
{
    GetHotelListModel data ;

    public GetHotelListModel getData() {
        return data;
    }

    public void setData(GetHotelListModel data) {
        this.data = data;
    }
}
