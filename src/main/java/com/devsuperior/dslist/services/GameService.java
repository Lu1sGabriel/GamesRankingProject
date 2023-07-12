package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dtos.GameMinDto;
import com.devsuperior.dslist.models.GameModel;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<GameModel> result = gameRepository.findAll();
        return result.stream().map(GameMinDto::new).toList();

    }
}
