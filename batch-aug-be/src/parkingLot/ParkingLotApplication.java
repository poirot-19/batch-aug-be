package caseStudies.parkingLot;

import caseStudies.parkingLot.controllers.TicketController;
import caseStudies.parkingLot.repositories.GateRepository;
import caseStudies.parkingLot.repositories.ParkingLotRepository;
import caseStudies.parkingLot.repositories.TicketRepository;
import caseStudies.parkingLot.repositories.VehicleRepository;
import caseStudies.parkingLot.services.TicketService;

public class ParkingLotApplication {
    public static void main(String[] args) {
        // What should I initialize first?
        // 1 - controllers
        // 2 - services
        // 3 - repositories

        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository,
                vehicleRepository, parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        System.out.println("Server is listening at :8080");


    }
}
