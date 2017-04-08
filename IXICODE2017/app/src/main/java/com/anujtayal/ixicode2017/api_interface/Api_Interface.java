package com.anujtayal.ixicode2017.api_interface;

import com.anujtayal.ixicode2017.bean.CityModel;
import com.anujtayal.ixicode2017.bean.GetListOfSuggestedCities;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface Api_Interface
{
    @GET("/action/content/zeus/autocomplete?searchFor=tpAutoComplete&neCategories=City")
    public void getListOfSuggestedCity(@Query("query") String query, Callback<ArrayList<CityModel>> response);
}
