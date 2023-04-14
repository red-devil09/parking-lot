package com.example.parkinglot.model.parking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//jaise hi humne ye segregation kia, to parent class ke kaafi methods mei hume arguement dena
//pd rha tha, parkingSpotType, ab vo nhi dena pd rha as we already know, ki either of
//CarParkingLot ya BikeParkingLot ka hi object create hoga



//ab hum carParkingLot and bikeParkingLot alag hi bna dia to parent class mei
//Map use krne ki koi zrurat nhi hai, simple List se kaam chl jaega
public class CarParkingLot extends ParkingLot{

    private static CarParkingLot CAR_PARKING_LOT = null;
    private CarParkingLot(int n){
        //ek car ka parkingLot bnao having "n" spots
        this.id = UUID.randomUUID().toString();

        List<ParkingSpot> carParkingSpots = new ArrayList<>();
        for(int i=0;i<n;i++){
            carParkingSpots.add(createParkingSpot());
        }
        this.parkingSpots = carParkingSpots;
        this.parkingStrategy = new FirstEmptyParkingStrategy(carParkingSpots);

    }


    public static ParkingLot createParkingLot(int n) {
        if(CAR_PARKING_LOT == null){
            System.out.println("new Car Lot created");
            CAR_PARKING_LOT = new CarParkingLot(n);
        }
        return CAR_PARKING_LOT;
    }

    public static ParkingLot getParkingLot(){
        return CAR_PARKING_LOT;
    }

    @Override
    CarParkingSpot createParkingSpot() {
        String spotId = UUID.randomUUID().toString();
        return new CarParkingSpot(spotId);
    }

    @Override
    public ParkingSpot addParkingSpot() {
        CarParkingSpot carParkingSpot = createParkingSpot();
        this.parkingSpots.add(carParkingSpot);
        return carParkingSpot;
    }
}
