package com.api.twiteroo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.twiteroo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUsername(String username);

}
