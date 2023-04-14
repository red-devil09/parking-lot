package com.example.parkinglot.model.utils;

import com.example.parkinglot.model.parking.ParkingSpot;
import com.example.parkinglot.model.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"parkingSpot.vehicle"})
public class Ticket {
    private int entryTime;
    private ParkingSpot parkingSpot;

    private Ticket(int entryTime,Vehicle vehicle, ParkingSpot parkingSpot){
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
    }

    public static Ticket generateTicket(int entryTime,Vehicle vehicle, ParkingSpot parkingSpot){
        return new Ticket(entryTime,vehicle,parkingSpot);
    }

}
