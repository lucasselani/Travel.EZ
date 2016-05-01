package com.swinatel.travelez;

/**
 * Created by lucas on 30/04/2016.
 */
public class Program {
    private String destination;
    private String type;
    private int duration;
    private String price;
    private String agency;
    private int icon;

    public Program(int icon, String agency, String price, String destination, String type, int duration) {
        this.icon = icon;
        this.agency = agency;
        this.price = price;
        this.destination = destination;
        this.type = type;
        this.duration = duration;
    }

    public String getDestination() {
        return destination;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public String getPrice() {
        return price;
    }

    public String getAgency() {
        return agency;
    }

    public int getIcon() {
        return icon;
    }
}
