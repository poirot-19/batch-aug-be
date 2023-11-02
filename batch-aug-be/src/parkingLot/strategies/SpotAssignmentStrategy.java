package caseStudies.parkingLot.strategies;

import caseStudies.parkingLot.models.Gate;
import caseStudies.parkingLot.models.ParkingSpot;
import caseStudies.parkingLot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot getSpot(Gate gate, VehicleType vehicleType);
}
