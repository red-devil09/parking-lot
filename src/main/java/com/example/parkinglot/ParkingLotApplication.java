package com.example.parkinglot;

import com.example.parkinglot.model.parking.*;
import com.example.parkinglot.model.vehicle.Bike;
import com.example.parkinglot.model.vehicle.Car;
import com.example.parkinglot.model.vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ParkingLotApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ParkingLotApplication.class, args);

		createParkingLot(10,15);

		Vehicle bike = new Bike(8873);
		Vehicle car = new Car(4472);
		Vehicle bike2 = new Bike(4342);
		Vehicle car2 = new Car(1111);

		List<Vehicle> vehicle = List.of(bike,car,bike2,car2);

		for(var i:vehicle){
			ParkingLot parkingLot = ParkingLotFactory.getParkingLot(i);
			ParkingSpot parkingSpot = parkingLot.findParkingSpot();
			parkingLot.parkVehicle(i,parkingSpot);
			System.out.println(" done ");
		}

		System.out.println("basic function done");
	}

	private static void createParkingLot(int i, int i1) {
		BikeParkingLot.createParkingLot(i);
		CarParkingLot.createParkingLot(i1);
	}

}
