package caseStudies.parkingLot.strategies;

import caseStudies.parkingLot.models.Gate;
import caseStudies.parkingLot.models.ParkingFloor;
import caseStudies.parkingLot.models.ParkingLot;
import caseStudies.parkingLot.models.ParkingSpot;
import caseStudies.parkingLot.models.ParkingSpotStatus;
import caseStudies.parkingLot.models.VehicleType;
import caseStudies.parkingLot.repositories.ParkingLotRepository;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy{

    ParkingLotRepository parkingLotRepository;

    @Override
    public ParkingSpot getSpot(Gate gate, VehicleType vehicleType) {
        ParkingLot parkingLot = parkingLotRepository.findByGate(gate);

        for(ParkingFloor floor: parkingLot.getFloors()){
            for(ParkingSpot parkingSpot: floor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) && parkingSpot.getSupportedVehicleTypes().contains(vehicleType))
                    return parkingSpot;
            }
        }
        return null;
    }
}
