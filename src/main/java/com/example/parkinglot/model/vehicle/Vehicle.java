package com.example.parkinglot.model.vehicle;

import com.example.parkinglot.model.utils.Ticket;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Vehicle {
    Integer number;
    VehicleType vehicleType;
    Ticket ticket;

    public Vehicle(Integer number, VehicleType type){
        this.number = number;
        this.vehicleType = type;
    }

}
