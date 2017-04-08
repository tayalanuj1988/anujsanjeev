package com.anujtayal.ixicode2017.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.anujtayal.ixicode2017.R;
import com.anujtayal.ixicode2017.adapter.RouteOptionAdapter;
import com.anujtayal.ixicode2017.bean.A2BModel;
import com.anujtayal.ixicode2017.bean.GetA2BModel;
import com.anujtayal.ixicode2017.bean.RouteModel;
import com.anujtayal.ixicode2017.utils.AppConstant;
import com.anujtayal.ixicode2017.utils.SimpleDividerItemDecoration;

import java.util.ArrayList;

public class RouteDetailActivity extends BaseActivity
{
    private Toolbar toolbar;
    private TextView tvTbTitle;
    private TextView tv_mode_option;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_to_b_roots);

        setTitle("");

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tvTbTitle = (TextView) findViewById(R.id.tvTbTitle);
        tv_mode_option = (TextView) findViewById(R.id.tv_mode_option);

        if (toolbar != null)
        {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            tvTbTitle.setText("Mumbai to Delhi");
            toolbar.setNavigationIcon(R.drawable.back_arrow);
        }

        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        tv_mode_option.setText("");

//        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
//        LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(this);
//        mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
//        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getResources()));

//        callA2BApi(originCityId, destinationCityId, AppConstant.API_5_A2B);
    }

    @Override
    protected void performApiSuccessCallback(Bundle bundle, String REQUEST_CODE)
    {
//        if (REQUEST_CODE.equalsIgnoreCase(AppConstant.API_5_A2B))
//        {
//            GetA2BModel model = (GetA2BModel) bundle.getSerializable(AppConstant.API_5_A2B);
//            A2BModel _model = model.getData();
//            ArrayList<RouteModel> _root_model = _model.getRoutes();
//
//            RouteOptionAdapter adapter = new RouteOptionAdapter(RouteDetailActivity.this,_root_model);
//            recyclerView.setAdapter(adapter);
//        }
    }
}