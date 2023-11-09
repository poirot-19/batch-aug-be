package com.example.bookmyshowsep23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Region extends BaseModel{
    private String name;

    // 1 : m
    // 1 : 1
    // 1 : m
    @OneToMany
    private List<Theatre> theatres;

}
