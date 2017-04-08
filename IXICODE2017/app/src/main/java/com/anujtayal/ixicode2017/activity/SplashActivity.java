package com.anujtayal.ixicode2017.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.anujtayal.ixicode2017.R;
import com.anujtayal.ixicode2017.api_interface.Api_Interface;
import com.anujtayal.ixicode2017.bean.A2BModel;
import com.anujtayal.ixicode2017.bean.CityModel;
import com.anujtayal.ixicode2017.bean.GetEntityDetailModel;
import com.anujtayal.ixicode2017.bean.GetHotelData;
import com.anujtayal.ixicode2017.bean.GetRecommondedDestinationModel;
import com.anujtayal.ixicode2017.bean.GetA2BModel;

import com.anujtayal.ixicode2017.utils.AppConstant;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class SplashActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //callGetSuggestedCityListApi();
         callGetInterstedPointForCityListApi();
       // callGetEntityDetailApi();
       // callGetRecommendedDestinationListApi();
//        callA2BApi();
    }


    private void callGetSuggestedCityListApi() {
        // mProgressDialog = Utils.showProgressDialog(this);
        //create an adapter for retrofit with base url
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(AppConstant.BASE_URL).build();

        //creating a service for adapter with our GET class
        Api_Interface git = restAdapter.create(Api_Interface.class);

        git.getListOfSuggestedCity("mumbai",new Callback<ArrayList<CityModel>>() {
            @Override
            public void success(ArrayList<CityModel> list, Response response) {
                //  Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(SplashActivity.this, "Status " + list.size(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(RetrofitError error) {
//                Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_message), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void callGetInterstedPointForCityListApi() {
        // mProgressDialog = Utils.showProgressDialog(this);
        //create an adapter for retrofit with base url
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(AppConstant.BASE_URL).build();

        //creating a service for adapter with our GET class
        Api_Interface git = restAdapter.create(Api_Interface.class);

        git.getPointOfInterestedForACity("503b2a8ae4b032e338f12dc3","Places To Visit,Hotel,Things To Do", "1", "100", new Callback<GetHotelData>() {
            @Override
            public void success(GetHotelData list, Response response) {
                //  Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(SplashActivity.this, "Status ", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(RetrofitError error) {
//                Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_message), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void callGetEntityDetailApi()
    {
        // mProgressDialog = Utils.showProgressDialog(this);
        //create an adapter for retrofit with base url
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(AppConstant.BASE_URL).build();

        //creating a service for adapter with our GET class
        Api_Interface git = restAdapter.create(Api_Interface.class);

        git.getEntityDetail("503b2a90e4b032e338f13ba5",new Callback<GetEntityDetailModel>() {
            @Override
            public void success(GetEntityDetailModel list, Response response) {
                //  Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(SplashActivity.this, "Status " , Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(RetrofitError error) {
//                Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_message), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void callGetRecommendedDestinationListApi()
    {
        // mProgressDialog = Utils.showProgressDialog(this);
        //create an adapter for retrofit with base url
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(AppConstant.BASE_URL).build();

        //creating a service for adapter with our GET class
        Api_Interface git = restAdapter.create(Api_Interface.class);

        git.getRecommendedDestinationsList(new Callback<GetRecommondedDestinationModel>() {
            @Override
            public void success(GetRecommondedDestinationModel list, Response response) {
                //  Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(SplashActivity.this, "Status " , Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(RetrofitError error) {
//                Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_message), Toast.LENGTH_LONG).show();
            }
        });
    }

  //  GEThttp://build2.ixigo.com/api/v2/a2b/modes?apiKey=ixicode!2$&originCityId=1075798&destinationCityId=1075379

    private void callA2BApi()
    {
        // mProgressDialog = Utils.showProgressDialog(this);
        //create an adapter for retrofit with base url
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(AppConstant.BASE_URL).build();

        //creating a service for adapter with our GET class
        Api_Interface git = restAdapter.create(Api_Interface.class);

        git.getA2BApiCall("1075798","1075379",new Callback<GetA2BModel>() {
            @Override
            public void success(GetA2BModel list, Response response) {
                //  Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(SplashActivity.this, "Status " , Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(RetrofitError error) {
//                Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_message), Toast.LENGTH_LONG).show();
            }
        });
    }
}
