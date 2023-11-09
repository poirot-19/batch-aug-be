package com.example.bookmyshowsep23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{

    // 1 -> 1
    // m <- 1
    @ManyToOne
    private Show show;

    // 1 -> 1
    // m <- 1
    @ManyToOne
    private SeatType seatType;
    private int price;
}
