package com.example.bookmyshowsep23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    // 1 -> 1
    // m <- 1
    // m->1
    @ManyToOne
    private Show show;

    // 1 -> 1
    // m <- 1
    // m:1
    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;
}
