package caseStudies.parkingLot.repositories;

import caseStudies.parkingLot.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {

    // Implement Vehicle Repository

    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber){
        return Optional.empty();
    }

    public Vehicle saveVehicle(Vehicle vehicle){
        // Vehicle that will be returned will have an id as well
        return null;
    }
}
