package com.example.parkinglot.model.parking;

import com.example.parkinglot.model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BikeParkingLot extends ParkingLot{

    private static BikeParkingLot BIKE_PARKING_LOT = null;


    //singleton mei multiple thread ke angle se bhi socho
    private BikeParkingLot(int n){

        //ek bike parkingLot bnao "n" spots ka
        this.id = UUID.randomUUID().toString();
        //yahi list reference se humne current object ki parkingSpotList set kri, issi se humne parkingStrategy mei
        //parking list set kri, hence ek ka change doosre mei dikh rha h
        List<ParkingSpot> bikeParkingSpots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bikeParkingSpots.add(createParkingSpot());
        }
        this.parkingSpots = bikeParkingSpots;
        this.parkingStrategy = new FirstEmptyParkingStrategy(bikeParkingSpots);

    }


   public static ParkingLot createParkingLot(int n) {
        if(BIKE_PARKING_LOT == null){
            System.out.println("New Bike Lot created");
            BIKE_PARKING_LOT = new BikeParkingLot(n);
        }
        return BIKE_PARKING_LOT;
    }

    public static ParkingLot getParkingLot(){
        return BIKE_PARKING_LOT;
    }

    @Override
    BikeParkingSpot createParkingSpot() {
        String spotId = UUID.randomUUID().toString();
        return new BikeParkingSpot(spotId);
    }

    @Override
    public ParkingSpot addParkingSpot() {
        BikeParkingSpot bikeParkingSpot = createParkingSpot();
        this.parkingSpots.add(bikeParkingSpot);
        return bikeParkingSpot;
    }

}
