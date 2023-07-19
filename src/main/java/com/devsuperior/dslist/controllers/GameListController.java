package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dtos.GameListDto;
import com.devsuperior.dslist.dtos.GameMinDto;
import com.devsuperior.dslist.dtos.ReplacementDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDto>> findAll() {
        return ResponseEntity.ok(gameListService.findAll());
    }

    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<GameMinDto> findGameById(@PathVariable(value = "listId") Long listId) {
        ResponseEntity<?> result = gameService.findGameByList(listId);
        return (ResponseEntity<GameMinDto>) result;

    }

    @PostMapping(value = "/{listId}/replacement")
    public ResponseEntity<?> move(@PathVariable(value = "listId") Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
        return ResponseEntity.ok().build();
    }

}
