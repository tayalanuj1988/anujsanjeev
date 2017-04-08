package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;

/**
 * Created by sanjeev on 08/04/17.
 */

public class GetEntityDetailModel implements Serializable
{
    private EntityDescriptionModel data;

    public EntityDescriptionModel getData() {
        return data;
    }

    public void setData(EntityDescriptionModel data) {
        this.data = data;
    }
}
