package com.example.parkinglot.model.utils;

import com.example.parkinglot.model.parking.ParkingLot;
import com.example.parkinglot.model.parking.ParkingLotFactory;
import com.example.parkinglot.model.parking.ParkingSpot;
import com.example.parkinglot.model.vehicle.Vehicle;

import java.time.LocalTime;

public class Entrance {
    //entrance is the gateway to our parking lot
    public Entrance(){

    }

    public ParkingSpot findParkingSpace(Vehicle vehicle){
        ParkingLot parkingLot = ParkingLotFactory.getParkingLot(vehicle);
        return parkingLot.findParkingSpot();
    }

    public Ticket bookSpot(Vehicle v,ParkingSpot p){
        ParkingLot parkingLot = ParkingLotFactory.getParkingLot(v);
        parkingLot.parkVehicle(v,p);
        return generateTicket(v,p);

    }

    private Ticket generateTicket(Vehicle v,ParkingSpot p){
        Ticket t = Ticket.generateTicket(LocalTime.now().getNano(), v,p);
        v.setTicket(t);
        return t;
    }

}
