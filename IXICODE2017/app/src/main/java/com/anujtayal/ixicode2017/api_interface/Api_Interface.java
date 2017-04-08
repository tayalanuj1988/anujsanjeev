package com.anujtayal.ixicode2017.api_interface;

import com.anujtayal.ixicode2017.bean.CityModel;
import com.anujtayal.ixicode2017.bean.GetListOfSuggestedCities;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.http.GET;

public interface Api_Interface
{
    @GET("/action/content/zeus/autocomplete?searchFor=tpAutoComplete&neCategories=City&query={query}")
    public void getListOfSuggestedCity( Callback<ArrayList<CityModel>> response);
}
