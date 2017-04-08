package com.anujtayal.ixicode2017.api_interface;

import com.anujtayal.ixicode2017.bean.CityModel;
import com.anujtayal.ixicode2017.bean.GetEntityDetailModel;
import com.anujtayal.ixicode2017.bean.GetHotelData;
import com.anujtayal.ixicode2017.bean.GetRecommondedDestinationModel;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface Api_Interface {
    @GET("/action/content/zeus/autocomplete?searchFor=tpAutoComplete&neCategories=City")
    public void getListOfSuggestedCity(@Query("query") String query, Callback<ArrayList<CityModel>> response);

    @GET("/api/v3/namedentities/city/503b2a90e4b032e338f13ba5/categories?apiKey=ixicode!2$")
    public void getPointOfInterestedForACity(@Query("type") String type, @Query("skip") String skip, @Query("limit") String limit, Callback<GetHotelData> response);

    @GET("/api/v3/namedentities/id/{entityId}?apiKey=ixicode!2$")
    public void getEntityDetail(@Path("entityId") String entityId, Callback<GetEntityDetailModel> response);

    @GET("/api/v2/widgets/brand/inspire?product=1&apiKey=ixicode!2$")
    public void getRecommendedDestinationsList(Callback<GetRecommondedDestinationModel> response);
}
