package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class TrainListModel implements Serializable
{
    private String classType;
    private String fare;

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }
}
