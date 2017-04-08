package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class GetListOfSuggestedCities implements Serializable
{
    private ArrayList<CityModel> list;

    public ArrayList<CityModel> getList() {
        return list;
    }

    public void setList(ArrayList<CityModel> list) {
        this.list = list;
    }
}
