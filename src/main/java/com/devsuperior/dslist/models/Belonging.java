package com.devsuperior.dslist.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_BELONGING")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Belonging {
    @EmbeddedId
    @EqualsAndHashCode.Include
    private BelongingPrimaryKey id = new BelongingPrimaryKey();
    private Integer position;

    public Belonging() {
    }

    public Belonging(GameModel gameModel, GameList gameList, Integer position) {
        id.setGameModel(gameModel);
        id.setGameList(gameList);
        this.position = position;
    }
}
