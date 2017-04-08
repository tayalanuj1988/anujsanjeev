package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sanjeev on 08/04/17.
 */

public class GetFlightAndBudgetFlightModel implements Serializable
{
    private ArrayList<FlightModel> flight;
    private ArrayList<FlightModel> budget_flight;

    public ArrayList<FlightModel> getFlight() {
        return flight;
    }

    public void setFlight(ArrayList<FlightModel> flight) {
        this.flight = flight;
    }

    public ArrayList<FlightModel> getBudget_flight() {
        return budget_flight;
    }

    public void setBudget_flight(ArrayList<FlightModel> budget_flight) {
        this.budget_flight = budget_flight;
    }
}
