package com.devsuperior.movieflix.services.interfaces;

import com.devsuperior.movieflix.dto.ReviewDTO;

import java.util.List;

public interface ReviewServiceIT {

    ReviewDTO saveReview(ReviewDTO dto);

    List<ReviewDTO> findByMovie(Long movieId);
}
