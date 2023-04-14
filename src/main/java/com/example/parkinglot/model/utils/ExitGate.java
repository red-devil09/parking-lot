package com.example.parkinglot.model.utils;

import com.example.parkinglot.model.parking.ParkingLot;
import com.example.parkinglot.model.parking.ParkingLotFactory;
import com.example.parkinglot.model.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExitGate {

    public ExitGate(){

    }

    public int removeVehicle(Vehicle vehicle){
        ParkingLot parkingLot = ParkingLotFactory.getParkingLot(vehicle);
        parkingLot.removeVehicle(vehicle.getTicket().getParkingSpot());
        return calculatePrice(vehicle.getTicket());
    }
    private int calculatePrice(Ticket t){
        return LocalDateTime.now().getSecond()*100 - t.getEntryTime();
    }
}
