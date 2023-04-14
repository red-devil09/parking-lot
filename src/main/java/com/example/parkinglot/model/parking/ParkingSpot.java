package com.example.parkinglot.model.parking;


import com.example.parkinglot.model.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"vehicle.ticket", "ticket.parkingSpot"})
public abstract class ParkingSpot {
     String id;
     Boolean isFree;
     Vehicle vehicle;
     ParkingSpotType type;

     public ParkingSpot(String id, ParkingSpotType type){
          this.id = id;
          this.type = type;
          this.isFree = true;
     }

     public void parkVehicle(Vehicle v){
          this.isFree = false;
          this.vehicle = v;
     }

     public void freeSpot(){
          this.isFree = true;
          this.vehicle = null;
     }


}
