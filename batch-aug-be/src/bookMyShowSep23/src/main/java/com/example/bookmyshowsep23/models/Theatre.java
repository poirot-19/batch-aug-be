package com.example.bookmyshowsep23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;

    // 1 - 1
    // M - 1
    // m:1

    @ManyToOne
    private Region region;

    // 1 - m
    // 1 - 1
    // 1:m
    @OneToMany
    private List<Screen> screens;

}
