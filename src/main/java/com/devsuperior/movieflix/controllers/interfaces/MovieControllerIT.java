package com.devsuperior.movieflix.controllers.interfaces;


import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = "/movies")
public interface MovieControllerIT {

    @GetMapping
    ResponseEntity<Page<MovieDTO>> find(@RequestParam(value = "genreId", defaultValue = "0") Long genreId,
                                        Pageable pageable);

    @GetMapping(value = "/{id}")
    ResponseEntity<MovieDTO> findById(@PathVariable Long id);

    @GetMapping(value = "/{movieId}/reviews")
    ResponseEntity<List<ReviewDTO>> findMovieReviews(@PathVariable Long movieId);
}
