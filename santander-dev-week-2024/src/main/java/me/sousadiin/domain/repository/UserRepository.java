package me.sousadiin.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.sousadiin.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
