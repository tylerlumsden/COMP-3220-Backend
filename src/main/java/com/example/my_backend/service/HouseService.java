package com.example.my_backend.service;

import com.example.my_backend.model.*;
import com.example.my_backend.utils.CSVReaderUtil;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

import java.io.*;

@Service
public class HouseService {

    private Housing houseList;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {
        // Load data from CSV file
        houseList = CSVReaderUtil.loadHouses("houses.csv");
        System.out.println("Housing data loaded.");
    }

    public List<House> searchHouses(String city, Double minPrice, Double maxPrice, Integer minBed) {
        return houseList.filter(city, minPrice, maxPrice, minBed);
    }
}
