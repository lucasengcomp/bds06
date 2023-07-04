package com.devsuperior.movieflix.services.interfaces;

import com.devsuperior.movieflix.entities.User;

public interface AuthServiceIT {

    User authenticated();

    void validateSelfOrAdmin(Long userId);
}
