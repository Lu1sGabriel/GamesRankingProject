package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dtos.GameMinDto;
import com.devsuperior.dslist.models.GameModel;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public Page<GameMinDto> findAll(Pageable pageable) {
        Page<GameModel> result = gameRepository.findAll(pageable);
        return result.map(GameMinDto::new);
    }
}
