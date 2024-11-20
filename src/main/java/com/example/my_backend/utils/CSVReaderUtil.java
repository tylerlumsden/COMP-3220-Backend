package com.example.my_backend.utils;

import com.example.my_backend.model.House;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderUtil {

    public static List<House> loadHouses(String fileName) {
        List<House> houses = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new ClassPathResource(fileName).getInputStream())
            );
            String line;
            reader.readLine(); // Skip header
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");

                // Add checks to ensure the array is accessed safely
                String brokeredBy = fields.length > 0 ? fields[0] : "";
                String status = fields.length > 1 ? fields[1] : "";
                double price = fields.length > 2 && !fields[2].isEmpty() ? Double.parseDouble(fields[2]) : 0.0;
                int bed = fields.length > 3 && !fields[3].isEmpty() ? Integer.parseInt(fields[3]) : 0;
                int bath = fields.length > 4 && !fields[4].isEmpty() ? Integer.parseInt(fields[4]) : 0;
                double acreLot = fields.length > 5 && !fields[5].isEmpty() ? Double.parseDouble(fields[5]) : 0.0;
                String street = fields.length > 6 ? fields[6] : "";
                String city = fields.length > 7 ? fields[7] : "";
                String state = fields.length > 8 ? fields[8] : "";
                String zipCode = fields.length > 9 ? fields[9] : "";
                double houseSize = fields.length > 10 && !fields[10].isEmpty() ? Double.parseDouble(fields[10]) : 0.0;
                String prevSoldDate = fields.length > 11 ? fields[11] : "";

                House house = new House(
                        brokeredBy, status, price, bed, bath, acreLot, street,
                        city, state, zipCode, houseSize, prevSoldDate
                );
                houses.add(house);
            }
        } catch (Exception e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
            e.printStackTrace();
        }
        return houses;
    }
}
