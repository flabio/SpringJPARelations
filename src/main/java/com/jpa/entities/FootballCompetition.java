package com.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FootballCompetition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name",unique = true,columnDefinition = "varchar(250)")
    private String name;
    @Column(name="cuantity_price")
    private Integer cuantityPrice;
    @Column(name = "start_date",columnDefinition = "DATE")
    private LocalDate startDate;
    @Column(name="end_date",columnDefinition = "DATE")
    private  LocalDate endDate;

}
