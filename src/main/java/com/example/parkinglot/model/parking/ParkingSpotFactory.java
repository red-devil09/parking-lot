package com.example.parkinglot.model.parking;

public class ParkingSpotFactory {

    public static ParkingSpot getParkingSpot(ParkingSpotType type,String id){
        if(type.toString().equals("BIKE"))
            return new BikeParkingSpot(id);
        else if(type.toString().equals("CAR"))
            return new CarParkingSpot(id);
        else return null;
    }
}
