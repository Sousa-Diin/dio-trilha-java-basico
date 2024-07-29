package me.sousadiin.service;


import me.sousadiin.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
