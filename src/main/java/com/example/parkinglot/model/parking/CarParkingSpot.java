package com.example.parkinglot.model.parking;

import com.example.parkinglot.model.parking.ParkingSpot;
import com.example.parkinglot.model.parking.ParkingSpotType;

public class CarParkingSpot extends ParkingSpot {
    public CarParkingSpot(String id){
        super(id, ParkingSpotType.CAR);
    }
}
