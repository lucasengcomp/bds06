package com.devsuperior.movieflix.services.interfaces;

import com.devsuperior.movieflix.dto.GenreDTO;

import java.util.List;

public interface GenreServiceIT {

    List<GenreDTO> findAllGenres();

    GenreDTO findGenreId(Long id);
}
