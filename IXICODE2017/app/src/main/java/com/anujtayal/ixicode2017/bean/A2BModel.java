package com.anujtayal.ixicode2017.bean;

import com.anujtayal.ixicode2017.R;
import com.mobisys.android.autocompleteview.annotations.ViewId;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class A2BModel implements Serializable
{
    private String originName;
    private String destinationName;
    private OriginAndDestinationModel origin;
    private OriginAndDestinationModel destination;
    private boolean noModesPossible;
    private ArrayList<RouteModel> routes;

    private String modes;
    private String sort;
    private boolean directFlight;
    private boolean directTrain;
    private boolean directBus;
    private boolean directCar;

    private String directIndirectSentence;
    private String distance;

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public OriginAndDestinationModel getOrigin() {
        return origin;
    }

    public void setOrigin(OriginAndDestinationModel origin) {
        this.origin = origin;
    }

    public OriginAndDestinationModel getDestination() {
        return destination;
    }

    public void setDestination(OriginAndDestinationModel destination) {
        this.destination = destination;
    }

    public boolean isNoModesPossible() {
        return noModesPossible;
    }

    public void setNoModesPossible(boolean noModesPossible) {
        this.noModesPossible = noModesPossible;
    }

    public ArrayList<RouteModel> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<RouteModel> routes) {
        this.routes = routes;
    }

    public String getModes() {
        return modes;
    }

    public void setModes(String modes) {
        this.modes = modes;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public boolean isDirectFlight() {
        return directFlight;
    }

    public void setDirectFlight(boolean directFlight) {
        this.directFlight = directFlight;
    }

    public boolean isDirectTrain() {
        return directTrain;
    }

    public void setDirectTrain(boolean directTrain) {
        this.directTrain = directTrain;
    }

    public boolean isDirectBus() {
        return directBus;
    }

    public void setDirectBus(boolean directBus) {
        this.directBus = directBus;
    }

    public boolean isDirectCar() {
        return directCar;
    }

    public void setDirectCar(boolean directCar) {
        this.directCar = directCar;
    }

    public String getDirectIndirectSentence() {
        return directIndirectSentence;
    }

    public void setDirectIndirectSentence(String directIndirectSentence) {
        this.directIndirectSentence = directIndirectSentence;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public boolean isMultiModes() {
        return multiModes;
    }

    public void setMultiModes(boolean multiModes) {
        this.multiModes = multiModes;
    }

    public RouteModel getFastestRoute() {
        return fastestRoute;
    }

    public void setFastestRoute(RouteModel fastestRoute) {
        this.fastestRoute = fastestRoute;
    }

    public String getResCount() {
        return resCount;
    }

    public void setResCount(String resCount) {
        this.resCount = resCount;
    }

    public String getChepOrgDst() {
        return chepOrgDst;
    }

    public void setChepOrgDst(String chepOrgDst) {
        this.chepOrgDst = chepOrgDst;
    }

    public String getFastOrgDst() {
        return fastOrgDst;
    }

    public void setFastOrgDst(String fastOrgDst) {
        this.fastOrgDst = fastOrgDst;
    }

    public String getOriginAirportCode() {
        return originAirportCode;
    }

    public void setOriginAirportCode(String originAirportCode) {
        this.originAirportCode = originAirportCode;
    }

    public RouteModel getCheapestRoute() {
        return cheapestRoute;
    }

    public void setCheapestRoute(RouteModel cheapestRoute) {
        this.cheapestRoute = cheapestRoute;
    }

    public String getShowSummary() {
        return showSummary;
    }

    public void setShowSummary(String showSummary) {
        this.showSummary = showSummary;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    private boolean multiModes;
    private RouteModel fastestRoute;


    private String resCount;

    private String chepOrgDst;
    private String fastOrgDst;
    private String originAirportCode;
    private RouteModel cheapestRoute;
    private String showSummary;
    private String direct;
}
