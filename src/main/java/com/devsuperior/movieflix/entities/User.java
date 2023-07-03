package com.devsuperior.movieflix.entities;

import java.util.*;

public class User {

    private Long id;

    private String name;

    private String email;

    private String password;

    private List<Review> reviews = new ArrayList<>();

    Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(Long id, String name, String email, String password, List<Review> reviews) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.reviews = reviews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
