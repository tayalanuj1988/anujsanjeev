package com.anujtayal.ixicode2017.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.anujtayal.ixicode2017.R;
import com.anujtayal.ixicode2017.api_interface.Api_Interface;
import com.anujtayal.ixicode2017.bean.CityModel;
import com.anujtayal.ixicode2017.bean.GetListOfSuggestedCities;
import com.anujtayal.ixicode2017.utils.AppConstant;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        callGetSuggestedCityListApi();
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
}
