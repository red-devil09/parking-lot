package com.example.parkinglot.model.parking;

import com.example.parkinglot.model.vehicle.Vehicle;

import java.util.*;

public abstract class ParkingLot {
    String id;
    List<ParkingSpot> parkingSpots ;
    Map<String, ParkingSpot> usedParkingSpots = new HashMap<>();
    ParkingStrategy parkingStrategy;

    //hr ek object ko initialize ki zrurat nhi hoti
    public ParkingLot(){
    }
    abstract ParkingSpot createParkingSpot();

    public abstract ParkingSpot addParkingSpot();

    public ParkingSpot findParkingSpot(){
        return parkingStrategy.findParkingSpot();
    }


    public void parkVehicle(Vehicle vehicle,ParkingSpot parkingSpot){
        parkingSpot.parkVehicle(vehicle);
        usedParkingSpots.put(parkingSpot.getId(),parkingSpot);
        System.out.println("Vehicle " + vehicle + " parked at " + parkingSpot);
    }

    public void removeVehicle(ParkingSpot parkingSpot){
        int parkedAtThis = parkingSpot.getVehicle().getNumber();
        parkingSpot.freeSpot();
        usedParkingSpots.remove(parkingSpot.getId());
        System.out.println("Vehicle " + parkedAtThis + " removed from  " + parkingSpot);

    }
}
