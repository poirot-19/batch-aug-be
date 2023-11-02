package caseStudies.parkingLot.strategies;

import caseStudies.parkingLot.models.SpotAssignmentStrategyType;

public class SpotAssignmentStrategyFactory {

    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType type){
        return new NearestSpotAssignmentStrategy();
    }
}
