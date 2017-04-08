package com.anujtayal.ixicode2017.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.anujtayal.ixicode2017.R;
import com.anujtayal.ixicode2017.bean.GetA2BModel;
import com.anujtayal.ixicode2017.utils.AppConstant;

public class A2BRootsActivity extends BaseActivity {
    String originCityId, destinationCityId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_to_b_roots);
        originCityId = getIntent().getStringExtra(AppConstant.ORIGINCITYID);
        destinationCityId = getIntent().getStringExtra(AppConstant.DESTINATIONCITYID);
        callA2BApi(originCityId, destinationCityId, AppConstant.API_5_A2B);
    }

    @Override
    protected void performApiSuccessCallback(Bundle bundle, String REQUEST_CODE) {
        if (REQUEST_CODE.equalsIgnoreCase(AppConstant.API_5_A2B)) {
            ((TextView) findViewById(R.id.roots)).setText(((GetA2BModel) bundle.getSerializable(AppConstant.API_5_A2B)).getData().getDestinationName());
        }
    }
}