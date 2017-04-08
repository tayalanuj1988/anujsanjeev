package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class FirstStepModel implements Serializable
{
    private String origin;
    private String originCode;
    private boolean destination;

    private String destinationCode;
    private String mode;
    private String originXid;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public boolean isDestination() {
        return destination;
    }

    public void setDestination(boolean destination) {
        this.destination = destination;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getMode() {
        return mode;
    }

    public String getOriginXid() {
        return originXid;
    }

    public void setOriginXid(String originXid) {
        this.originXid = originXid;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDestinationXid() {
        return destinationXid;
    }

    public void setDestinationXid(String destinationXid) {
        this.destinationXid = destinationXid;
    }

    public String getOriginMongoId() {
        return originMongoId;
    }

    public void setOriginMongoId(String originMongoId) {
        this.originMongoId = originMongoId;
    }

    public String getDestinationMongoId() {
        return destinationMongoId;
    }

    public void setDestinationMongoId(String destinationMongoId) {
        this.destinationMongoId = destinationMongoId;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public boolean isFastestCarrier() {
        return fastestCarrier;
    }

    public void setFastestCarrier(boolean fastestCarrier) {
        this.fastestCarrier = fastestCarrier;
    }

    public ArrayList<CarriersModel> getCarriers() {
        return carriers;
    }

    public void setCarriers(ArrayList<CarriersModel> carriers) {
        this.carriers = carriers;
    }

    private String destinationXid;
    private String originMongoId;
    private String destinationMongoId;

    private String originId;
    private String destinationId;
    private boolean fastestCarrier;
   private ArrayList<CarriersModel> carriers;
}
