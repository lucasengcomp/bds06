package com.devsuperior.movieflix.controllers.impl;


import com.devsuperior.movieflix.controllers.interfaces.MovieControllerIT;
import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.services.interfaces.MovieServiceIT;
import com.devsuperior.movieflix.services.interfaces.ReviewServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieControllerImpl implements MovieControllerIT {

    @Autowired
    private MovieServiceIT movieService;

    @Autowired
    private ReviewServiceIT reviewService;

    public ResponseEntity<Page<MovieDTO>> find(@RequestParam(value = "genreId", defaultValue = "0") Long genreId,
                                               Pageable pageable) {
        Page<MovieDTO> list = movieService.find(genreId, pageable);
        return ResponseEntity.ok(list);
    }

    public ResponseEntity<MovieDTO> findById(@PathVariable Long id) {
        MovieDTO dto = movieService.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    public ResponseEntity<List<ReviewDTO>> findMovieReviews(@PathVariable Long movieId) {
        List<ReviewDTO> dto = reviewService.findByMovie(movieId);
        return ResponseEntity.ok(dto);
    }
}
