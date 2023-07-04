package com.devsuperior.movieflix.controllers.impl;

import com.devsuperior.movieflix.controllers.interfaces.GenreControllerIT;
import com.devsuperior.movieflix.dto.GenreDTO;
import com.devsuperior.movieflix.services.interfaces.GenreServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenreControllerImpl implements GenreControllerIT {

    @Autowired
    private GenreServiceIT service;

    public ResponseEntity<List<GenreDTO>> findALL() {
        List<GenreDTO> list = service.findAllGenres();
        return ResponseEntity.ok().body(list);
    }

    public ResponseEntity<GenreDTO> findGenreId(@PathVariable Long id) {
        GenreDTO dto = service.findGenreId(id);
        return ResponseEntity.ok().body(dto);
    }
}
