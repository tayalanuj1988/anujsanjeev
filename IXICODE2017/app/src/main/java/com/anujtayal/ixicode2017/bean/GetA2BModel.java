package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class GetA2BModel implements Serializable
{
    private A2BModel data;

    public A2BModel getData() {
        return data;
    }

    public void setData(A2BModel data) {
        this.data = data;
    }
}
