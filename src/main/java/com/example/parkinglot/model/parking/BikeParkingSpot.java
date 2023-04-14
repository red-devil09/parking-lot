package com.example.parkinglot.model.parking;

import com.example.parkinglot.model.parking.ParkingSpot;
import com.example.parkinglot.model.parking.ParkingSpotType;

public class BikeParkingSpot extends ParkingSpot {
    public BikeParkingSpot(String id){
        super(id, ParkingSpotType.BIKE);
    }
}
