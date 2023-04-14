package com.example.parkinglot.model.parking;

import java.util.List;

public class FirstEmptyParkingStrategy implements ParkingStrategy{

    private List<ParkingSpot> parkingSpotList2;

    public FirstEmptyParkingStrategy(List<ParkingSpot> parkingSpotList){
        this.parkingSpotList2 = parkingSpotList;
    }

    @Override
    public ParkingSpot findParkingSpot() {
        for(var i:parkingSpotList2){
            if(i.isFree)
                return i;
        }
        return null;

    }

    @Override
    public void updateParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList2 = parkingSpotList;

    }
}
