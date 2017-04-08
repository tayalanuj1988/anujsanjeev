package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;

/**
 * Created by sanjeev on 08/04/17.
 */

public class GetRecommondedDestinationModel implements Serializable
{
    private GetFlightAndBudgetFlightModel data;

    public GetFlightAndBudgetFlightModel getData() {
        return data;
    }

    public void setData(GetFlightAndBudgetFlightModel data) {
        this.data = data;
    }
}
