package com.api.twiteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.twiteroo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
