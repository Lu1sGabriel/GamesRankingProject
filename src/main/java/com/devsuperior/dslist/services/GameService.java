package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dtos.GameDto;
import com.devsuperior.dslist.dtos.GameMinDto;
import com.devsuperior.dslist.exceptions.ErrorDto;
import com.devsuperior.dslist.models.GameModel;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<GameModel> result = gameRepository.findAll();
        return result.stream().map(GameMinDto::new).toList();

    }

    @Transactional(readOnly = true)
    public ResponseEntity<?> findGameById(Long id) {
        Optional<GameModel> optionalGame = gameRepository.findById(id);
        if (optionalGame.isPresent()) {
            GameModel result = optionalGame.get();
            var gameDto = new GameDto(result);
            return ResponseEntity.ok(gameDto);
        } else {
            var errorDto = new ErrorDto("Jogo não encontrado com o ID: " + id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDto);
        }
    }

    @Transactional(readOnly = true)
    public ResponseEntity<List<?>> findGameByList(Long listId) {
        List<GameMinProjection> optionalGameMinProjection = gameRepository.searchByList(listId);
        if (optionalGameMinProjection.isEmpty()) {
            var errorDto = new ErrorDto("Lista não encontrada com o ID: " + listId);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList(errorDto));
        } else {
            List<GameMinDto> gameDtoList = new ArrayList<>();
            for (GameMinProjection projection : optionalGameMinProjection) {
                gameDtoList.add(new GameMinDto(projection));
            }
            return ResponseEntity.ok(gameDtoList);
        }
    }


}
