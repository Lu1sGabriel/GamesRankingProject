package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dtos.GameDto;
import com.devsuperior.dslist.dtos.GameMinDto;
import com.devsuperior.dslist.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameMinDto>> findAll() {
        return ResponseEntity.ok(gameService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GameDto> findGameById(@PathVariable(value = "id") Long id) {
        ResponseEntity<?> result = gameService.findGameById(id);
        return (ResponseEntity<GameDto>) result;

    }


}
