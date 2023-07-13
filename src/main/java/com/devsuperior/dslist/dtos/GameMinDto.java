package com.devsuperior.dslist.dtos;

import com.devsuperior.dslist.models.GameModel;
import com.devsuperior.dslist.projections.GameMinProjection;
import lombok.Getter;

@Getter
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

    public GameMinDto(GameMinProjection projection){
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        short_description = projection.getShortDescription();
    }


}
