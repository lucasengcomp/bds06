package com.devsuperior.movieflix.services;


import com.devsuperior.movieflix.controllers.exceptions.ResourceNotFoundException;
import com.devsuperior.movieflix.dto.GenreDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GenreService {

    @Autowired
    private GenreRepository repository;

    @Transactional(readOnly = true)
    public List<GenreDTO> findAllGenres() {
        List<Genre> obj = repository.findAll();
        return obj.stream().map(GenreDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public GenreDTO findGenreId(Long id) {
        Optional<Genre> obj = repository.findById(id);
        Genre entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new GenreDTO(entity);
    }
}
