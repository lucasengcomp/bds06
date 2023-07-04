package com.devsuperior.movieflix.services.interfaces;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserServiceIT {

    UserDTO finbyId(Long id);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    User findUserProfile();
}
