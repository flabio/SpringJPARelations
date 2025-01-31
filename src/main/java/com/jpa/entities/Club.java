package com.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(targetEntity = Coach.class,cascade = CascadeType.PERSIST)
    private Coach coach;

    @OneToMany(targetEntity = Player.class,fetch = FetchType.LAZY,mappedBy = "club")
    private List<Player> playerList;

    @ManyToOne(targetEntity = FootballAssociation.class)
    private FootballAssociation footballAssociation;

    @ManyToMany(targetEntity = FootballCompetition.class, fetch = FetchType.LAZY)
    @JoinTable(name="club_competition",joinColumns = @JoinColumn(name="club"),inverseJoinColumns = @JoinColumn(name="competition"))
    private List<FootballCompetition> footballCompetitionList;
}
