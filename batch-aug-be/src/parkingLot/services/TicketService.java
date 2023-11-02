package caseStudies.parkingLot.services;

import caseStudies.parkingLot.Exceptions.GateNotFoundException;
import caseStudies.parkingLot.models.Gate;
import caseStudies.parkingLot.models.SpotAssignmentStrategyType;
import caseStudies.parkingLot.models.Ticket;
import caseStudies.parkingLot.models.Vehicle;
import caseStudies.parkingLot.models.VehicleType;
import caseStudies.parkingLot.repositories.GateRepository;
import caseStudies.parkingLot.repositories.ParkingLotRepository;
import caseStudies.parkingLot.repositories.TicketRepository;
import caseStudies.parkingLot.repositories.VehicleRepository;
import caseStudies.parkingLot.strategies.SpotAssignmentStrategy;
import caseStudies.parkingLot.strategies.SpotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;
import java.util.Random;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(String vehicleNumber,
                              String vehicleOwnerName,
                              VehicleType vehicleType,
                              Long gateId) throws GateNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findByGateId(gateId);
        if (!optionalGate.isPresent())
            throw new GateNotFoundException();
        Gate gate = optionalGate.get();
        ticket.setGate(gate);

        Vehicle savedVehicle;
        Optional<Vehicle> optionalVehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);
        if(!optionalVehicle.isPresent()){
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setNumber(vehicleNumber);
            vehicle.setOwnerName(vehicleOwnerName);
            savedVehicle = vehicleRepository.saveVehicle(vehicle);
        } else {
            savedVehicle = optionalVehicle.get();
        }

        ticket.setVehicle(savedVehicle);
        ticket.setGeneratedBy(gate.getOperator());
        ticket.setNumber("Ticket No " + new Random().nextInt());

        SpotAssignmentStrategyType type= parkingLotRepository.findByGate(gate).getSpotAssignmentStrategyType();
        SpotAssignmentStrategy strategy = SpotAssignmentStrategyFactory.getSpotAssignmentStrategy(type);
        ticket.setParkingSpot(strategy.getSpot(gate, vehicleType));
        ticketRepository.saveTicket(ticket);
        return ticket;
    }
}
