package com.devsuperior.movieflix.controllers.interfaces;


import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/users")
public interface UserControllerIT {

    @GetMapping(value = "/{id}")
    ResponseEntity<UserDTO> findById(@PathVariable Long id);

    @GetMapping(value = "/profile")
    ResponseEntity<User> findUserProfile();
}
