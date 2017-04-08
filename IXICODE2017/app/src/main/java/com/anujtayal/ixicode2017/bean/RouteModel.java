package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class RouteModel implements Serializable
{
    private String price;
    private String time;
    private ArrayList<String> modeTypesCss;
    private ArrayList<StepsModel> steps;
    private ArrayList<String> modes;
    private ArrayList<String> via;
    private ArrayList<String> layOverTimes;

    private String fastestDuration;
    private String modeViaString;
    private String timeUnit;
    private String type;
    private String firstModeTypesCss;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<String> getModeTypesCss() {
        return modeTypesCss;
    }

    public void setModeTypesCss(ArrayList<String> modeTypesCss) {
        this.modeTypesCss = modeTypesCss;
    }

    public ArrayList<StepsModel> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<StepsModel> steps) {
        this.steps = steps;
    }

    public ArrayList<String> getModes() {
        return modes;
    }

    public void setModes(ArrayList<String> modes) {
        this.modes = modes;
    }

    public ArrayList<String> getVia() {
        return via;
    }

    public void setVia(ArrayList<String> via) {
        this.via = via;
    }

    public ArrayList<String> getLayOverTimes() {
        return layOverTimes;
    }

    public void setLayOverTimes(ArrayList<String> layOverTimes) {
        this.layOverTimes = layOverTimes;
    }

    public String getFastestDuration() {
        return fastestDuration;
    }

    public void setFastestDuration(String fastestDuration) {
        this.fastestDuration = fastestDuration;
    }

    public String getModeViaString() {
        return modeViaString;
    }

    public void setModeViaString(String modeViaString) {
        this.modeViaString = modeViaString;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstModeTypesCss() {
        return firstModeTypesCss;
    }

    public void setFirstModeTypesCss(String firstModeTypesCss) {
        this.firstModeTypesCss = firstModeTypesCss;
    }

    public String getTimePretty() {
        return timePretty;
    }

    public void setTimePretty(String timePretty) {
        this.timePretty = timePretty;
    }

    public String getTimePrettySuffix() {
        return timePrettySuffix;
    }

    public void setTimePrettySuffix(String timePrettySuffix) {
        this.timePrettySuffix = timePrettySuffix;
    }

    public String getDurationPretty() {
        return durationPretty;
    }

    public void setDurationPretty(String durationPretty) {
        this.durationPretty = durationPretty;
    }

    public String getAllStepModes() {
        return allStepModes;
    }

    public void setAllStepModes(String allStepModes) {
        this.allStepModes = allStepModes;
    }

    public String getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(String durationHours) {
        this.durationHours = durationHours;
    }

    public ArrayList<String> getRestModeTypesCss() {
        return restModeTypesCss;
    }

    public void setRestModeTypesCss(ArrayList<String> restModeTypesCss) {
        this.restModeTypesCss = restModeTypesCss;
    }

    public String getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(String durationMinutes) {
        this.durationMinutes = durationMinutes;
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

    public FirstStepModel getFirstStep() {
        return firstStep;
    }

    public void setFirstStep(FirstStepModel firstStep) {
        this.firstStep = firstStep;
    }

    private String timePretty;

    private String timePrettySuffix;
    private String durationPretty;
    private String allStepModes;
    private String durationHours;
    private ArrayList<String> restModeTypesCss;
    private String durationMinutes;
    private String fastOrgDst;
    private String originAirportCode;
    private String showSummary;
    private String direct;
    private FirstStepModel firstStep;
}
