package com.example.my_backend.service;

import com.example.my_backend.model.House;
import com.example.my_backend.utils.CSVReaderUtil;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    private List<House> houseList;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {
        // Load data from CSV file
        houseList = CSVReaderUtil.loadHouses("houses.csv");
    }

    public List<House> searchHouses(String city, Double minPrice, Double maxPrice, Integer minBed) {
        return houseList.stream()
                .filter(h -> (city == null || h.getCity().equalsIgnoreCase(city)))
                .filter(h -> (minPrice == null || h.getPrice() >= minPrice))
                .filter(h -> (maxPrice == null || h.getPrice() <= maxPrice))
                .filter(h -> (minBed == null || h.getBed() >= minBed))
                .toList();
    }
}
