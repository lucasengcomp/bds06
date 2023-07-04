package com.devsuperior.movieflix.entities.pk;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

public class ReviewPK {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public ReviewPK() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewPK reviewPK = (ReviewPK) o;
        return Objects.equals(user, reviewPK.user) && Objects.equals(movie, reviewPK.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, movie);
    }
}
