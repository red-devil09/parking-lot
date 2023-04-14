package com.example.parkinglot.model.vehicle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Vehicle {
    Integer number;
    VehicleType vehicleType;

    public Vehicle(Integer number, VehicleType type){
        this.number = number;
        this.vehicleType = type;
    }

}
