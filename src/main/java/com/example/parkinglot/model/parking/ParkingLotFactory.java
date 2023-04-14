package com.example.parkinglot.model.parking;

import com.example.parkinglot.model.vehicle.Vehicle;

public class ParkingLotFactory {

    public static ParkingLot getParkingLot(Vehicle vehicle){
        if(vehicle.getVehicleType().toString().equals("CAR"))
            return CarParkingLot.getParkingLot();
        else
            return BikeParkingLot.getParkingLot();
    }
}
