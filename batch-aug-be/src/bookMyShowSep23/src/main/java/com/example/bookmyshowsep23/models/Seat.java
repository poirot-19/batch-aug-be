package com.example.bookmyshowsep23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String number;

    // 1 - 1
    // m : 1
    // m:1
    @ManyToOne
    private SeatType seatType;
    private int rowNum;
    private int colNum;

}
