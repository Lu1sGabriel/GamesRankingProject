package com.devsuperior.dslist.dtos;


import com.devsuperior.dslist.models.GameModel;

public class GameMinDto {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String short_description;

    public GameMinDto() {
    }

    public GameMinDto(GameModel entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        short_description = entity.getShort_description();
    }
}
