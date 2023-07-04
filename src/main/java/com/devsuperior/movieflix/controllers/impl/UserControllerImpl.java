package com.devsuperior.movieflix.controllers.impl;

import com.devsuperior.movieflix.controllers.interfaces.UserControllerIT;
import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.services.interfaces.UserServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements UserControllerIT {

    @Autowired
    private UserServiceIT service;

    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        UserDTO dto = service.finbyId(id);
        return ResponseEntity.ok().body(dto);
    }

    public ResponseEntity<User> findUserProfile() {
        User dto = service.findUserProfile();
        return ResponseEntity.ok().body(dto);
    }
}
