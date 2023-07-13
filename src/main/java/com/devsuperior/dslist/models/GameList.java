package com.devsuperior.dslist.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Table(name = "TB_GAME_LIST")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GameList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;
    private String name;
}
