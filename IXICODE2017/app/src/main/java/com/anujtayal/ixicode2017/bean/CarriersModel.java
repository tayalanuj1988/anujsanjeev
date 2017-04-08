package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class CarriersModel implements Serializable
{
    private String code;
    private String time;
    private String carrierName;
    private String depTime;
    private String arrTime;
    private String trainType;
    private String destinationCode;
    private String originCode;
    private String daysOfOperation;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getArrTime() {
        return arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public String getDaysOfOperation() {
        return daysOfOperation;
    }

    public void setDaysOfOperation(String daysOfOperation) {
        this.daysOfOperation = daysOfOperation;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ArrayList<String> getAvailableClassList() {
        return availableClassList;
    }

    public void setAvailableClassList(ArrayList<String> availableClassList) {
        this.availableClassList = availableClassList;
    }

    public ArrayList<String> getBusAmenitiesList() {
        return busAmenitiesList;
    }

    public void setBusAmenitiesList(ArrayList<String> busAmenitiesList) {
        this.busAmenitiesList = busAmenitiesList;
    }

    public String getCommaSeparatedDOO() {
        return commaSeparatedDOO;
    }

    public void setCommaSeparatedDOO(String commaSeparatedDOO) {
        this.commaSeparatedDOO = commaSeparatedDOO;
    }

    private String price;
    //private ArrayList<String> tfList;
    private ArrayList<String> availableClassList;
    private ArrayList<String> busAmenitiesList;
    private String commaSeparatedDOO;




}
