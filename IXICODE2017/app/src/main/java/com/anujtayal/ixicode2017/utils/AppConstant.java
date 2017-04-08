package com.anujtayal.ixicode2017.utils;

/**
 * Created by sanjeev on 08/04/17.
 */

public interface AppConstant
{
    String BASE_URL = "https://build2.ixigo.com";

    /**
     * The desired interval for location updates. Inexact. Updates may be more
     * or less frequent.
     */
    long UPDATE_INTERVAL_IN_MILLISECONDS = 10000;

    /**
     * The fastest rate for active location updates. Exact. Updates will never
     * be more frequent than this value.
     */
    long FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS = UPDATE_INTERVAL_IN_MILLISECONDS / 2;

    /**
     * Constant used in the location settings dialog.
     */
    int REQUEST_CHECK_SETTINGS = 0x1;



    String API_1_FOR_SOURCE_LOCATION = "API_1_FOR_SOURCE_LOCATION";
}
