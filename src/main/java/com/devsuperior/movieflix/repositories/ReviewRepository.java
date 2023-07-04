package com.devsuperior.movieflix.repositories;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query("SELECT obj FROM Review obj JOIN FETCH obj.user WHERE obj.movie = :movie ")
    List<Review> findByReviewByMovie(Movie movie);

    @Query("SELECT obj FROM Review obj JOIN FETCH obj.user WHERE obj.movie = :movie  ")
    List<Review> findReviewsByMovies(Movie movie);
}
