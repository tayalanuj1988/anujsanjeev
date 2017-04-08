package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class StepsModel implements Serializable
{
    private String origin;
    private String originCode;

    private String destination;
    private String destinationCode;
    private String mode;
    private String originXid;
    private String destinationXid;
    private String originMongoId;

    private String originId;
    private String destinationMongoId;
    private String destinationId;
    private String fastestCarrier;
    private ArrayList<CarriersModel> carriers;

    private String minPrice;
    private String minTime;
    private String timeUnits;
    private String originLatitude;
    private String originLongitude;
    private double destinationLatitude;
    private double destinationLongitude;
    private String code;

    private String distance;
    private String fastestCarrierDuration;
    private String modePretty;
    private String carrierName;
    private String typeInfo;



}
