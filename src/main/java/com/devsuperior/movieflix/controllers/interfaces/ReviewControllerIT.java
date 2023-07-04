package com.devsuperior.movieflix.controllers.interfaces;

import com.devsuperior.movieflix.dto.ReviewDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping(value = "/reviews")
public interface ReviewControllerIT {

    @PreAuthorize("hasAnyRole('MEMBER')")
    @PostMapping
    ResponseEntity<ReviewDTO> saveReview(@Valid @RequestBody ReviewDTO dto);
}
