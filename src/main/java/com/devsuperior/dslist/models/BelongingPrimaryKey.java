package com.devsuperior.dslist.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable // Encapsulando dois atributos, em uma classe só
public class BelongingPrimaryKey {
    @ManyToOne
    @JoinColumn(name = "game_id")
    private GameModel gameModel;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;
}
