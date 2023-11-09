package com.example.bookmyshowsep23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMethod paymentMethod;
    private int referenceNum;
    private Date timeStamp;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.ORDINAL)
    private PaymentProvider paymentProvider;

    // ORM - Object Relation Mapping
    // converts the Models into Tables when the application would be started
    // ORM - will take care of writing complex queries behind the scenes
    // We will just call the ORM functions and ORM will create the query behind the scene


}
