package com.anujtayal.ixicode2017.activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.anujtayal.ixicode2017.R;
import com.anujtayal.ixicode2017.api_interface.Api_Interface;
import com.anujtayal.ixicode2017.bean.CityModel;
import com.anujtayal.ixicode2017.bean.GetA2BModel;
import com.anujtayal.ixicode2017.bean.GetEntityDetailModel;
import com.anujtayal.ixicode2017.bean.GetHotelData;
import com.anujtayal.ixicode2017.bean.GetRecommondedDestinationModel;
import com.anujtayal.ixicode2017.bean.HotelModel;
import com.anujtayal.ixicode2017.utils.AppConstant;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected abstract void performApiSuccessCallback(Bundle bundle, String REQUEST_CODE);

    protected void callGetSuggestedCityListApi(String locality, final String REQUEST_CODE) {
        // mProgressDialog = Utils.showProgressDialog(this);
        //create an adapter for retrofit with base url
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(AppConstant.BASE_URL).build();

        //creating a service for adapter with our GET class
        Api_Interface git = restAdapter.create(Api_Interface.class);

        git.getListOfSuggestedCity(locality, new Callback<ArrayList<CityModel>>() {
            @Override
            public void success(ArrayList<CityModel> list, Response response) {
                //  Utils.cancelProgressDialog(mProgressDialog);
                Bundle bundle = new Bundle();
                bundle.putSerializable(AppConstant.API_1_FOR_SOURCE_LOCATION, list);
                performApiSuccessCallback(bundle, REQUEST_CODE);
            }

            @Override
            public void failure(RetrofitError error) {
//                Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_message), Toast.LENGTH_LONG).show();
            }
        });
    }

    //Places To Visit,Hotel,Things To Do
    protected void callGetInterstedPointForCityListApi() {
        new JsonTask().execute("http://build2.ixigo.com/api/v3/namedentities/city/503b2a8ae4b032e338f12dc3/categories?apiKey=ixicode!2$&type=Hotel&skip=1&limit=100");

//        // mProgressDialog = Utils.showProgressDialog(this);
//        //create an adapter for retrofit with base url
//        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(AppConstant.BASE_URL).build();
//
//        //creating a service for adapter with our GET class
//        Api_Interface git = restAdapter.create(Api_Interface.class);
//
//        git.getPointOfInterestedForACity("503b2a8ae4b032e338f12dc3", "hotel", "1", "100", new Callback<GetHotelData>() {
//            @Override
//            public void success(GetHotelData list, Response response) {
//                //  Utils.cancelProgressDialog(mProgressDialog);
//                Toast.makeText(BaseActivity.this, "Status ", Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
////                Utils.cancelProgressDialog(mProgressDialog);
//                Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_message), Toast.LENGTH_LONG).show();
//            }
//        });
    }


    private class JsonTask extends AsyncTask<String, String, String> {

//        protected void onPreExecute() {
//            super.onPreExecute();
//
//            pd = new ProgressDialog(MainActivity.this);
//            pd.setMessage("Please wait");
//            pd.setCancelable(false);
//            pd.show();
//        }

        protected String doInBackground(String... params) {


            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();


                InputStream stream = connection.getInputStream();

                reader = new BufferedReader(new InputStreamReader(stream));

                StringBuffer buffer = new StringBuffer();
                String line = "";

                while ((line = reader.readLine()) != null) {
                    buffer.append(line + "\n");
                    Log.d("Response: ", "> " + line);   //here u ll get whole response...... :-)

                }

                return buffer.toString();


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            if (result != null) {
                try {
                    JSONObject jsonObject = new JSONObject(result);
                    JSONObject data = jsonObject.getJSONObject("data");
                    ArrayList<HotelModel> entities = new ArrayList<HotelModel>();
                    entities.addAll(getEntities(data.getString("Places To Visit")));
                    entities.addAll(getEntities(data.getString("Things To Do")));
                    entities.addAll(getEntities(data.getString("Hotel")));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
//            if (pd.isShowing()){
//                pd.dismiss();
//            }
//            txtJson.setText(result);
        }

        private ArrayList<HotelModel> getEntities(String data) {
            HotelModel[] entity = null;
            Gson gson = new Gson();
            entity = gson.fromJson(data, HotelModel[].class);
            ArrayList<HotelModel> entities = new ArrayList<HotelModel>(Arrays.asList(entity));
            return entities;
        }
    }

    protected void callGetEntityDetailApi() {
        // mProgressDialog = Utils.showProgressDialog(this);
        //create an adapter for retrofit with base url
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(AppConstant.BASE_URL).build();

        //creating a service for adapter with our GET class
        Api_Interface git = restAdapter.create(Api_Interface.class);

        git.getEntityDetail("503b2a90e4b032e338f13ba5", new Callback<GetEntityDetailModel>() {
            @Override
            public void success(GetEntityDetailModel list, Response response) {
                //  Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(BaseActivity.this, "Status ", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(RetrofitError error) {
//                Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_message), Toast.LENGTH_LONG).show();
            }
        });
    }

    protected void callGetRecommendedDestinationListApi() {
        // mProgressDialog = Utils.showProgressDialog(this);
        //create an adapter for retrofit with base url
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(AppConstant.BASE_URL).build();

        //creating a service for adapter with our GET class
        Api_Interface git = restAdapter.create(Api_Interface.class);

        git.getRecommendedDestinationsList(new Callback<GetRecommondedDestinationModel>() {
            @Override
            public void success(GetRecommondedDestinationModel list, Response response) {
                //  Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(BaseActivity.this, "Status ", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void failure(RetrofitError error) {
//                Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_message), Toast.LENGTH_LONG).show();
            }
        });
    }

    //  GEThttp://build2.ixigo.com/api/v2/a2b/modes?apiKey=ixicode!2$&originCityId=1075798&destinationCityId=1075379
    protected void callA2BApi(String originCityId, String destinationCityId, final String REQUEST_CODE) {
        // mProgressDialog = Utils.showProgressDialog(this);
        //create an adapter for retrofit with base url
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(AppConstant.BASE_URL).build();

        //creating a service for adapter with our GET class
        Api_Interface git = restAdapter.create(Api_Interface.class);

        git.getA2BApiCall(originCityId, destinationCityId, new Callback<GetA2BModel>() {
            @Override
            public void success(GetA2BModel list, Response response) {
                //  Utils.cancelProgressDialog(mProgressDialog);
                Bundle bundle = new Bundle();
                bundle.putSerializable(AppConstant.API_5_A2B, list);
                performApiSuccessCallback(bundle, REQUEST_CODE);
            }

            @Override
            public void failure(RetrofitError error) {
//                Utils.cancelProgressDialog(mProgressDialog);
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.error_message), Toast.LENGTH_LONG).show();
            }
        });
    }
}
