package com.devsuperior.movieflix.controllers.impl;

import com.devsuperior.movieflix.controllers.interfaces.ReviewControllerIT;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.services.interfaces.ReviewServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class ReviewControllerImpl implements ReviewControllerIT {

    @Autowired
    private ReviewServiceIT reviewService;

    public ResponseEntity<ReviewDTO> saveReview(@Valid @RequestBody ReviewDTO dto) {
        dto = reviewService.saveReview(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
