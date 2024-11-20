package com.example.my_backend.controller;

import com.example.my_backend.model.House;
import com.example.my_backend.service.HouseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class HouseController {

    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/search")
    public List<House> searchHouses(@RequestParam(required = false) String city,
                                    @RequestParam(required = false) Double minPrice,
                                    @RequestParam(required = false) Double maxPrice,
                                    @RequestParam(required = false) Integer minBed) {
        return houseService.searchHouses(city, minPrice, maxPrice, minBed);
    }
}
