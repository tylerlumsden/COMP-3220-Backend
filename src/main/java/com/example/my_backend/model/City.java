package com.example.my_backend.model;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class City {
    private Map<String, ZIP> zipcodes; 
    private String name;

    public City(String name) {
        this.name = name;

        zipcodes = new HashMap<String, ZIP>();
    }

    public void add(String zipcode) {
        ZIP newzip = new ZIP(zipcode);
        zipcodes.put(zipcode, newzip);
    }

    public List<House> getHouses() {
        List<House> houses = new ArrayList<House>();
        for(ZIP zipcode : zipcodes.values()) {
            houses.addAll(zipcode.getHouses());
        }

        return houses;
    }

    public Map<String, ZIP> getZipcodes() {
        return zipcodes;
    }
}