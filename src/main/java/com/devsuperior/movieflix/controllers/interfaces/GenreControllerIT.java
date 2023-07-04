package com.devsuperior.movieflix.controllers.interfaces;

import com.devsuperior.movieflix.dto.GenreDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping(value = "/genres")
public interface GenreControllerIT {

    @GetMapping
    ResponseEntity<List<GenreDTO>> findALL();

    @GetMapping(value = "/{id}")
    ResponseEntity<GenreDTO> findGenreId(@PathVariable Long id);
}
