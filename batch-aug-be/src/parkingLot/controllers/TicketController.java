package caseStudies.parkingLot.controllers;

import caseStudies.parkingLot.dto.IssueTicketRequest;
import caseStudies.parkingLot.dto.IssueTicketResponse;
import caseStudies.parkingLot.dto.ResponseStatus;
import caseStudies.parkingLot.models.Ticket;
import caseStudies.parkingLot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest request){
        IssueTicketResponse response = new IssueTicketResponse();
        try{
            Ticket ticket = ticketService.issueTicket(
                    request.getVehicleNumber(), request.getVehicleOwner(),
                    request.getVehicleType(), request.getGateId()
            );
            response.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
