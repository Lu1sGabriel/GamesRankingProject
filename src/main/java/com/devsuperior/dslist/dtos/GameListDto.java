package com.devsuperior.dslist.dtos;

import com.devsuperior.dslist.models.GameList;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GameListDto {
    private long id;
    private String name;

    public GameListDto(GameList entity) {
        id = entity.getId();
        name = entity.getName();

    }
}
