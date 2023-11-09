package com.example.bookmyshowsep23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity (name = "shows")
public class Show extends BaseModel{

    // 1 : 1
    // m : 1
    // m->1
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;

    // 1 -> 1
    // m <- 1
    // m:1
    @ManyToOne
    private Screen screen;
}
