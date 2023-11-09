package com.example.bookmyshowsep23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{

    @ManyToMany
    private List<ShowSeat> seats;

    // 1 : 1
    // m  : 1
    // m -> 1
    @ManyToOne
    private Show show;

    // 1-> P1, P2, P3 {P1, P2, P3} -> 1:M
    // 1 <- 1
    // 1:M
    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    // 1 -> 1
    // M <- 1
    // M:1
    @ManyToOne
    private User user;
    private int price;
    private Date timeOfBooking;
}
