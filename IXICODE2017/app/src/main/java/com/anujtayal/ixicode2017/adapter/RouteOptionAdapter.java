package com.anujtayal.ixicode2017.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.anujtayal.ixicode2017.R;
import com.anujtayal.ixicode2017.bean.RouteModel;

import java.util.ArrayList;


public class RouteOptionAdapter extends RecyclerView.Adapter<RouteOptionAdapter.MyViewHolder>
{
    private ArrayList<RouteModel> routeModelsList;
    private Context mContext;


    public RouteOptionAdapter(Context context, ArrayList<RouteModel> list)
    {
        this.mContext = context;
        this.routeModelsList = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int position)
    {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.route_option_row, parent, false);
        MyViewHolder rcv = new MyViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, final int position)
    {
          myViewHolder.tv_modeViaString.setText("Route " + ( position + 1 ) + " : " +  routeModelsList.get(position).getModeViaString());
          myViewHolder.tv_total_time.setText("Total Travelling Time  : " + routeModelsList.get(position).getTime());
          myViewHolder.tv_total_price.setText("Total Travelling Charges : " + routeModelsList.get(position).getPrice());
          myViewHolder.tv_no_of_mode_count.setText("Total of Mode : " + routeModelsList.get(position).getModes().size() );
          myViewHolder.tv_first_mode.setText("First Mode  : " +  routeModelsList.get(position).getFirstModeTypesCss());
    }

    @Override
    public int getItemCount() {
        return routeModelsList .size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
       TextView tv_modeViaString, tv_total_time, tv_total_price, tv_no_of_mode_count, tv_first_mode;
        LinearLayout rootLayout;

        public MyViewHolder(View itemView) {
            super(itemView);

            rootLayout = (LinearLayout) itemView.findViewById(R.id.rootLayout);
            tv_modeViaString = (TextView) itemView.findViewById(R.id.tv_modeViaString);
            tv_total_time = (TextView) itemView.findViewById(R.id.tv_total_time);
            tv_total_price = (TextView) itemView.findViewById(R.id.tv_total_price);
            tv_no_of_mode_count = (TextView) itemView.findViewById(R.id.tv_no_of_mode_count);
            tv_first_mode = (TextView) itemView.findViewById(R.id.tv_first_mode);

            rootLayout.setOnClickListener(this);
            tv_modeViaString.setOnClickListener(this);
            tv_total_time.setOnClickListener(this);
            tv_total_price.setOnClickListener(this);
            tv_no_of_mode_count.setOnClickListener(this);
            tv_first_mode.setOnClickListener(this);
        }

        @Override
        public void onClick(View v)
        {
            if(v.getId() == R.id.rootLayout || v.getId() == R.id.tv_modeViaString || v.getId() == R.id.tv_total_time || v.getId() == R.id.tv_total_price  || v.getId() == R.id.tv_no_of_mode_count || v.getId() == R.id.tv_first_mode)
            {

            }
        }
    }

}