package com.devsuperior.dslist.dtos;

import com.devsuperior.dslist.models.GameModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class GameDto {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private double score;
    private String imgUrl;
    private String short_description;
    private String long_description;

    public GameDto(GameModel entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
