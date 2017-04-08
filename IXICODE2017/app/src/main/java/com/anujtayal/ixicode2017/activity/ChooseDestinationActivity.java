package com.anujtayal.ixicode2017.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.anujtayal.ixicode2017.R;
import com.anujtayal.ixicode2017.api_interface.Api_Interface;
import com.anujtayal.ixicode2017.bean.CityModel;
import com.anujtayal.ixicode2017.utils.AppConstant;
import com.google.gson.Gson;
import com.mobisys.android.autocompleteview.AutoCompleteView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class ChooseDestinationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_destination);
        ((com.mobisys.android.autocompleteview.AutoCompleteView) findViewById(R.id.auto_text_2)).setParser(new AutoCompleteView.AutoCompleteResponseParser() {
            @Override
            public ArrayList<? extends Object> parseAutoCompleteResponse(String response) {
                CityModel[] places = null;
                Gson gson = new Gson();
                places = gson.fromJson(response, CityModel[].class);
                ArrayList<CityModel> arrayList = new ArrayList<CityModel>(Arrays.asList(places));
                return arrayList;
            }
        });

        ((com.mobisys.android.autocompleteview.AutoCompleteView) findViewById(R.id.auto_text_2)).setSelectionListener(new AutoCompleteView.AutoCompleteItemSelectionListener() {
            @Override
            public void onItemSelection(Object obj) {
                CityModel place = (CityModel) obj;
                ((com.mobisys.android.autocompleteview.AutoCompleteView) findViewById(R.id.auto_text_2)).setText(place.getText());
                ((com.mobisys.android.autocompleteview.AutoCompleteView) findViewById(R.id.auto_text_2)).clearFocus();
            }
        });
    }
}
