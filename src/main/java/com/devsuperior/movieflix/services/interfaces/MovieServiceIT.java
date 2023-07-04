package com.devsuperior.movieflix.services.interfaces;

import com.devsuperior.movieflix.dto.MovieDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface MovieServiceIT {

    Page<MovieDTO> findAllPaged(Long genreId, String title, PageRequest pageRequest);

    MovieDTO findById(Long id);

    Page<MovieDTO> find(Long genreId, Pageable pageable);
}
