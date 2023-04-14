package com.example.parkinglot.model.parking;

import java.util.List;

public interface ParkingStrategy {
    public ParkingSpot findParkingSpot();

    public void updateParkingSpotList(List<ParkingSpot> parkingSpotList);
}
