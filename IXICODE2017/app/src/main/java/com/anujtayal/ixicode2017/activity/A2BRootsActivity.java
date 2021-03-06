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

public class A2BRootsActivity extends BaseActivity {
    private String originCityId, destinationCityId;
    private Toolbar toolbar;
    private TextView tvTbTitle;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_to_b_roots);

        setTitle("");

//        originCityId = getIntent().getStringExtra(AppConstant.ORIGINCITYID);
//        destinationCityId = getIntent().getStringExtra(AppConstant.DESTINATIONCITYID);

        originCityId = "1075798";
        destinationCityId = "1075379";

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tvTbTitle = (TextView) findViewById(R.id.tvTbTitle);

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

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        LinearLayoutManager mLinearLayoutManagerHorizontal = new LinearLayoutManager(this);
        mLinearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLinearLayoutManagerHorizontal);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getResources()));

        callA2BApi(originCityId, destinationCityId, AppConstant.API_5_A2B);
    }

    @Override
    protected void performApiSuccessCallback(Bundle bundle, String REQUEST_CODE)
    {
        if (REQUEST_CODE.equalsIgnoreCase(AppConstant.API_5_A2B))
        {
            GetA2BModel model = (GetA2BModel) bundle.getSerializable(AppConstant.API_5_A2B);
            A2BModel _model = model.getData();
            ArrayList<RouteModel> _root_model = _model.getRoutes();

            RouteOptionAdapter adapter = new RouteOptionAdapter(A2BRootsActivity.this,_root_model);
            recyclerView.setAdapter(adapter);
        }
    }
}